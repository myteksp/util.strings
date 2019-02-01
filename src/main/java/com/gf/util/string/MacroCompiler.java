package com.gf.util.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class MacroCompiler {
	public static final String compile(final String script, 
			final Map<String, Object> params, 
			final ValueSerializer serializer){
		if (script == null)
			return "";
		if (params == null)
			return script;
		if (params.isEmpty())
			return script;
		if (serializer == null)
			throw new NullPointerException("serializer was null");

		final int paramInitialLen = 15;
		final Map<String, String> paramsStr = new HashMap<String, String>(params.size() + 4);
		int paramLen = 0;
		for(final Entry<String, Object> e : params.entrySet()) {
			final String v = serializer.serialize(e.getValue());
			paramLen += v.length();
			paramsStr.put(e.getKey(), v);
		}


		final StringBuilder sb = new StringBuilder((int) ((script.length() + paramLen) * 1.5));

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder(paramInitialLen);
			@Override
			public final void onChar(final int i, final char c, final int len) {
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
						state = MacroState.EXPECTING_START;
						final String paranStr = param.toString();
						param = new StringBuilder(paramInitialLen);
						final String paramValue = paramsStr.get(paranStr);
						if (paramValue == null)
							sb.append("${").append(paranStr).append('}');
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
		});
		return sb.toString();
	}

	public static final String compile(final String script, 
			final Map<String, String> params){
		if (script == null)
			return "";
		if (params == null)
			return script;
		if (params.isEmpty())
			return script;

		final int paramInitialLen = 15;
		int paramLen = 0;
		for(final Entry<String, String> e : params.entrySet()) 
			paramLen += e.getValue().length();

		final StringBuilder sb = new StringBuilder((int) ((script.length() + paramLen) * 1.5));

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder(paramInitialLen);
			@Override
			public final void onChar(final int i, final char c, final int len) {
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
						state = MacroState.EXPECTING_START;
						final String paranStr = param.toString();
						param = new StringBuilder(paramInitialLen);
						final String paramValue = params.get(paranStr);
						if (paramValue == null)
							sb.append("${").append(paranStr).append('}');
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
		});
		return sb.toString();
	}

	public static final String compile(final String script, 
			final List<String> params){
		if (script == null)
			return "";
		if (params == null)
			return script;
		if (params.isEmpty())
			return script;
		final int paramInitialLen = 4;
		int paramLen = 0;
		for(final String e : params) 
			paramLen += e.length();

		final StringBuilder sb = new StringBuilder((int) ((script.length() + paramLen) * 1.5));

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder(paramInitialLen);
			@Override
			public final void onChar(final int i, final char c, final int len) {
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
						state = MacroState.EXPECTING_START;
						final String paramStr = param.toString();
						param = new StringBuilder(paramInitialLen);
						final String paramValue = params.get(Integer.parseInt(paramStr));
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
		});

		return sb.toString();
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
		final int len = o.length;
		final String[] res = new String[len];
		for (int i = 0; i < len; i++) 
			res[i] = objStr(o[i]);
		return res;
	}

	public static final String compileObjects(final String script, 
			final Object[] raw){
		if (script == null)
			return "";
		if (raw == null)
			return script;
		if (raw.length == 0)
			return script;

		final String[] params = cvrt(raw);

		final int paramInitialLen = 4;
		int paramLen = 0;
		for(final String e : params) 
			paramLen += e.length();

		final StringBuilder sb = new StringBuilder((int) ((script.length() + paramLen) * 1.5));

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder(paramInitialLen);
			@Override
			public final void onChar(final int i, final char c, final int len) {
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
						state = MacroState.EXPECTING_START;
						final String paramStr = param.toString();
						param = new StringBuilder(paramInitialLen);
						final String paramValue = params[Integer.parseInt(paramStr)];
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
		});

		return sb.toString();
	}

	public static final String compileInline(final String script, 
			final String ...params){
		return compile(script, params);
	}

	public static final String compile(final String script, 
			final String[] params){
		if (script == null)
			return "";
		if (params == null)
			return script;
		if (params.length == 0)
			return script;

		final int paramInitialLen = 4;
		int paramLen = 0;
		for(final String e : params) 
			paramLen += e.length();

		final StringBuilder sb = new StringBuilder((int) ((script.length() + paramLen) * 1.5));

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder(paramInitialLen);
			@Override
			public final void onChar(final int i, final char c, final int len) {
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
						state = MacroState.EXPECTING_START;
						final String paramStr = param.toString();
						param = new StringBuilder(paramInitialLen);
						final String paramValue = params[Integer.parseInt(paramStr)];
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
		});

		return sb.toString();
	}

	private static enum MacroState{
		EXPECTING_START, EXPECTING_OPEN, EXPECTING_CLOSE
	}

	public static interface ValueSerializer {
		String serialize(final Object value);
	}
}
