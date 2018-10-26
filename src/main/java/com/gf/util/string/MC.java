package com.gf.util.string;

import java.util.List;
import java.util.Map;

import com.gf.util.string.MacroCompiler.ValueSerializer;

public final class MC {
	public static final String format(final String script, 
			final Map<String, Object> params, 
			final ValueSerializer serializer){
		return MacroCompiler.compile(script, params, serializer);
	}
	
	public static final String format(final String script, 
			final Map<String, String> params){
		return MacroCompiler.compile(script, params);
	}
	
	public static final String format(final String script, 
			final List<String> params){
		return MacroCompiler.compile(script, params);
	}
	
	public static final String format(final String script, 
			final String ...params){
		return MacroCompiler.compile(script, params);
	}
	
	public static final String formatArray(final String script, 
			final String[] params){
		return MacroCompiler.compile(script, params);
	}
	
	public static final String fmt(final String script, final Object ...params) {
		return MacroCompiler.compileObjects(script, params);
	}
}
