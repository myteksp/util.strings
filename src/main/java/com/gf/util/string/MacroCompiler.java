package com.gf.util.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class MacroCompiler {
	public static final String compile(final String script, final Map<String, Object> params, final ValueSerializer serializer){
		if (script == null)
			return "";
		return execCompile(script, getParams(params, serializer));
	}

	public static final String compile(final String script, final Map<String, String> params){
		if (script == null)
			return "";
		return execCompile(script, getParams(params));
	}

	public static final String compile(final String script, final String[] params){
		return execCompile(script, getParams(params));
	}
	public static final String compile(final String script, final List<String> params){
		if (params == null)
			return script;
		final int len = params.size();
		if (len < 1)
			return script;
		return compile(script, params.toArray(new String[len]));
	}

	public static final String compileObjects(final String script, final Object[] raw){
		return compile(script, cvrt(raw));
	}

	public static final String compileInline(final String script, final String ...params){
		return compile(script, params);
	}

	private static final ScriptParameters getParams(final String[] _params){
		if (_params == null)
			return null;
		final int paramsArrayLength = _params.length;
		if (paramsArrayLength == 0)
			return null;

		int paramInitialLen = 1;
		int paramLen = 0;
		for(final String e : _params) {
			final int currentLength = e.length();
			if (currentLength > paramInitialLen){
				paramInitialLen = currentLength;
			}
			paramLen += currentLength;
		}
		final int _maxParamLen = paramInitialLen + 1;
		final int _totalParamsLen = paramLen;

		return new ScriptParameters() {
			private final int maxParamLen = _maxParamLen;
			private final int totalParamsLen = _totalParamsLen;
			private final int arrLen = paramsArrayLength;
			private final String[] params = _params;
			@Override
			public final int maxParamLen() {
				return maxParamLen;
			}
			@Override
			public final int totalParamsLen() {
				return totalParamsLen;
			}
			@Override
			public final String getParamValue(final String paramId) {
				final int index = Integer.parseInt(paramId);
				if (index < 0 || index >= arrLen)
					return null;
				return params[index];
			}
		};
	}

	private static final ScriptParameters getParams(final Map<String, Object> _params, final ValueSerializer serializer){
		if (_params == null)
			return null;
		if (_params.isEmpty())
			return null;
		if (serializer == null)
			throw new NullPointerException("serializer was null");

		final int size = _params.size();
		final Map<String, String> stringMap = new HashMap<String, String>(size + 16);
		for(final Entry<String, Object> e : _params.entrySet())
			stringMap.put(e.getKey(), serializer.serialize(e.getValue()));

		return getParams(stringMap);
	}

	private static final ScriptParameters getParams(final Map<String, String> _params){
		if (_params == null)
			return null;
		if (_params.isEmpty())
			return null;

		int paramInitialLen = 1;
		int paramLen = 0;
		for(final Entry<String, String> e : _params.entrySet()){
			final int currentLength = e.getValue().length();
			if (currentLength > paramInitialLen){
				paramInitialLen = currentLength;
			}
			paramLen += currentLength;
		}
		final int _maxParamLen = paramInitialLen + 1;
		final int _totalParamsLen = paramLen;
		return new ScriptParameters() {
			private final int maxParamLen = _maxParamLen;
			private final int totalParamsLen = _totalParamsLen;
			private final Map<String, String> params = _params;
			@Override
			public final int maxParamLen() {
				return maxParamLen;
			}
			@Override
			public final int totalParamsLen() {
				return totalParamsLen;
			}
			@Override
			public final String getParamValue(final String paramId) {
				return params.get(paramId);
			}
		};
	}

	private static final void stackElementToStr(final StackTraceElement e, final StringBuilder sb) {
		if (e.isNativeMethod()) 
			sb.append("[NATIVE]->");
		sb.append("[File(").append(e.getFileName()).append(")]->")
		.append("[Class(").append(e.getClassName()).append(")]->")
		.append("[Line(").append(e.getLineNumber()).append(")]");
	}

	private static final String stackTraceToStr(final Throwable t) {
		final StackTraceElement[] trace = t.getStackTrace();
		final int len = trace.length;
		final int last = len - 1;
		final StringBuilder sb = new StringBuilder((len * 60) + 30);
		sb.append("(");
		for (int i = 0; i < last; i++) {
			stackElementToStr(trace[i], sb);
			sb.append(", ");
		}
		stackElementToStr(trace[last], sb);
		sb.append(")");
		return sb.toString();
	}

	private static String toStr(final Throwable t) {
		final String message = t.getMessage();
		final String loaclMessage = t.getLocalizedMessage();
		if (message.equalsIgnoreCase(loaclMessage)) {
			return message + " : " + stackTraceToStr(t);
		}else {
			return message + "(" + loaclMessage + ") : " + stackTraceToStr(t);
		}
	}

	private static final String objStr(final Object o) {
		if (o == null)
			return "[null]";
		
		final Class<?> clz = o.getClass();
		
		if (clz.isPrimitive())
			return o.toString();

		if (o instanceof Throwable) 
			return toStr((Throwable)o);
		
		if (clz.isArray()) {
			final Object[] arr = (Object[])o;
			final int len = arr.length;
			final int last = len - 1;
			final StringBuilder sb = new StringBuilder(len * 30);
			sb.append("[");
			for (int i = 0; i < last; i++) {
				sb.append(objStr(arr[i])).append(", ");
			}
			sb.append(objStr(arr[last]));
			sb.append("]");
			return sb.toString();
		}
		
		return o.toString();
	}
	private static final String[] cvrt(final Object[] o) {
		if (o == null)
			return null;
		final int len = o.length;
		final String[] res = new String[len];
		for (int i = 0; i < len; i++) 
			res[i] = objStr(o[i]);
		return res;
	}

	public static final String execCompile(final String script, final ScriptParameters params){
		if (script == null)
			return "";
		if (params == null)
			return script;

		final int paramInitialLen = params.maxParamLen();
		final int scriptLength = script.length();
		final StringBuilder sb = new StringBuilder((int) ((scriptLength + params.totalParamsLen()) * 1.5));

		MacroState state = MacroState.EXPECTING_START;
		StringBuilder param = new StringBuilder(paramInitialLen);

		for (int i = 0; i < scriptLength; i++){
			final char c = script.charAt(i);
			switch(c){
				case '$':
					switch(state){
						case EXPECTING_START:
							state = MacroState.EXPECTING_OPEN;
							break;
						case EXPECTING_OPEN:
							throw new RuntimeException("Expected '{' but got '" + c + "' in '" + script + "'.");
						case EXPECTING_CLOSE:
							param.append(c);
							break;
					}
					break;
				case '{':
					switch(state){
						case EXPECTING_OPEN:
							state = MacroState.EXPECTING_CLOSE;
							break;
						case EXPECTING_CLOSE:
							param.append(c);
							break;
						case EXPECTING_START:
							sb.append(c);
							break;
					}
					break;
				case '}':
					switch(state){
						case EXPECTING_CLOSE:
							final String paramStr = param.toString();
							state = MacroState.EXPECTING_START;
							param = new StringBuilder(paramInitialLen);
							final String paramValue = params.getParamValue(paramStr);
							if (paramValue == null)
								sb.append("${").append(paramStr).append('}');
							else
								sb.append(paramValue);
							break;
						case EXPECTING_OPEN:
							throw new RuntimeException("Expected '{' but got '" + c + "' in '" + script + "'.");
						case EXPECTING_START:
							sb.append(c);
							break;
					}
					break;
				default:
					switch(state){
						case EXPECTING_START:
							sb.append(c);
							break;
						case EXPECTING_OPEN:
							throw new RuntimeException("Expected '{' but got '" + c + "' in '" + script + "'.");
						case EXPECTING_CLOSE:
							param.append(c);
							break;
					}
					break;
			}
		}

		return sb.toString();
	}

	private static enum MacroState{
		EXPECTING_START, EXPECTING_OPEN, EXPECTING_CLOSE
	}

	public static interface ValueSerializer {
		String serialize(final Object value);
	}

	private static interface ScriptParameters{
		int maxParamLen();
		int totalParamsLen();
		String getParamValue(final String paramId);
	}
}
