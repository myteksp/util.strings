package com.gf.util.string;

import org.junit.Test;

import static org.junit.Assert.*;

public final class GfStringTest {
	@Test
	public final void appendTest(){
		final GfString str1 = new GfString("string a");
		final GfString str2 = new GfString("string b");
		GfString res = str1.appendToEnd(str2);
		assertEquals("string astring b", res.toString());
		res = str1.appendToBeggining(str2);
		assertEquals("string bstring a", res.toString());
	}
}
