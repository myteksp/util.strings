package com.gf.util.string;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public final class MacroCompilerTest {
	@Test
	public final void macroStringsTest(){
		final HashMap<String, String> params = new HashMap<String, String>();
		params.put("param1", "This is param 1");
		params.put("param2", "This is the second");
		params.put("param3", "${MACRO_SUBSTITUDE}");
		params.put("param4", "this is the fourth");
		params.put("param{4", "passed");
		assertEquals("Here goes This is param 1. Repeat This is param 1. Second: 'This is the second'. Macro: ${MACRO_SUBSTITUDE}. Fourth: this is the fourth", 
				MacroCompiler.compile("Here goes ${param1}. Repeat ${param1}. Second: '${param2}'. Macro: ${param3}. Fourth: ${param4}", params));
		assertEquals("Here goes This is param 1. Repeat This is param 1. Second: 'This is the second'. Macro: ${MACRO_SUBSTITUDE}. Fourth: this is the fourth. Check: passed", 
				MacroCompiler.compile("Here goes ${param1}. Repeat ${param1}. Second: '${param2}'. Macro: ${param3}. Fourth: ${param4}. Check: ${param{4}", params));
	}


	@Test
	public final void macroObjectsTest(){
		final HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("param1", "This is param 1");
		params.put("param2", "This is the second");
		params.put("param3", "${MACRO_SUBSTITUDE}");
		params.put("param4", "this is the fourth");
		params.put("param{4", "passed");

		assertEquals("Here goes This is param 1. Repeat This is param 1. Second: 'This is the second'. Macro: ${MACRO_SUBSTITUDE}. Fourth: this is the fourth", 
				MacroCompiler.compile("Here goes ${param1}. Repeat ${param1}. Second: '${param2}'. Macro: ${param3}. Fourth: ${param4}", params, new MacroCompiler.ValueSerializer() {
					@Override
					public final String serialize(final Object value) {
						return value.toString();
					}
				}));
		assertEquals("Here goes This is param 1. Repeat This is param 1. Second: 'This is the second'. Macro: ${MACRO_SUBSTITUDE}. Fourth: this is the fourth. Check: passed", 
				MacroCompiler.compile("Here goes ${param1}. Repeat ${param1}. Second: '${param2}'. Macro: ${param3}. Fourth: ${param4}. Check: ${param{4}", params, new MacroCompiler.ValueSerializer() {

					@Override
					public final String serialize(final Object value) {
						return value.toString();
					}
				}));
	}
}
