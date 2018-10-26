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

	@Test
	public final void speed(){
		final int len = 1024*10;
		for (int i = 0; i < len; i++) {
			final String s1 = MC.fmt("Here goes ${0}. Repeat ${1}. Second: '${2}'. Macro: ${3}. Fourth: ${4}", "1", "2", "3", "4", "5");
			final String s2 = String.format("Here goes %s. Repeat %s. Second: '%s'. Macro: %s. Fourth: %s", "1", "2", "3", "4", "5");
			assertEquals(MC.format("Inconsistent with system format. ${0}  ---  ${1}", s1, s2), s1, s2);
		}
		for (int j = 0; j < 20; j++) {
			long gfTime = System.currentTimeMillis();
			for (int i = 0; i < len; i++) {
				MC.fmt("Here goes ${0}. Repeat ${1}. Second: '${2}'. Macro: ${3}. Fourth: ${4}", "1", "2", "3", "4", "5");
			}
			gfTime = System.currentTimeMillis() - gfTime;
			long ftime = System.currentTimeMillis();
			for (int i = 0; i < len; i++) {
				String.format("Here goes %s. Repeat %s. Second: '%s'. Macro: %s. Fourth: %s", "1", "2", "3", "4", "5");
			}
			ftime = System.currentTimeMillis() - ftime;
			System.out.println(MC.fmt("GF-${0} millis; System-${1} millis.", gfTime, ftime));
		}
	}
}
