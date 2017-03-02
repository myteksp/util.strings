package com.gf.util.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class MacroCompiler {
	public static final String compile(final String script, 
			final Map<String, Object> params, 
			final ValueSerializer serializer){
		if (script == null)
			return "";

		final StringBuilder sb = new StringBuilder(script.length() * 2);

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder();
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
						param = new StringBuilder();
						final String paramValue = serializer.serialize(params.get(paranStr));
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

		final StringBuilder sb = new StringBuilder(script.length() * 2);

		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder();
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
						param = new StringBuilder();
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

		final StringBuilder sb = new StringBuilder(script.length() * 2);
		
		CharsIterator.iterate(script, new CharsIterator.CharConsumer() {
			private MacroState state = MacroState.EXPECTING_START;
			private StringBuilder param = new StringBuilder();
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
						param = new StringBuilder();
						final String paramValue = params.get(Integer.parseInt(paranStr));
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
			final String[] params){
		return compile(script, Arrays.asList(params));
	}

	private static enum MacroState{
		EXPECTING_START, EXPECTING_OPEN, EXPECTING_CLOSE
	}

	public static interface ValueSerializer {
		String serialize(final Object value);
	}
}
