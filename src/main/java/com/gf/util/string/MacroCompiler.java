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
	
	private static final String objStr(final Object o) {
		if (o == null)
			return "[null]";
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
