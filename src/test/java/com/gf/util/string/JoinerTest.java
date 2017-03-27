package com.gf.util.string;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public final class JoinerTest {
	@Test
	public final void simpleJoinTest1(){
		final ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		final String result = Joiner.join(list, ", ");
		assertEquals("one, two, three", result);
	}
	
	@Test
	public final void simpleJoinTest2(){
		final String result = Joiner.join(new Object[]{"one", "two", "three"}, ", ");
		assertEquals("one, two, three", result);
	}
	
	@Test
	public final void glueJoinTest1(){
		final ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		final String result = Joiner.join(list, new Joiner.GlueFunction() {
			@Override
			public final String start(final String after) {
				return "START->";
			}
			@Override
			public final String end(final String before, final int index) {
				return "<-END";
			}
			@Override
			public String apply(String before, String after, int index) {
				return ", ";
			}
		});
		assertEquals("START->one, two, three<-END", result);
	}
}




