package com.gf.util.string;

import org.junit.Test;
import static org.junit.Assert.*;

public final class SplitterTest {
	@Test
	public final void simpleSplitTest(){
		assertEquals(4, Splitter.split("First|Second|Third|Fourth", '|').length);
		assertEquals(3, Splitter.split("First|Second|Third", '|').length);
		assertEquals(0, Splitter.split("", '|').length);
		assertEquals("First", Splitter.split("First|Second|Third|Fourth", '|')[0]);
		assertEquals("Second", Splitter.split("First|Second|Third|Fourth", '|')[1]);
		assertEquals("Third", Splitter.split("First|Second|Third|Fourth", '|')[2]);
		assertEquals("Fourth", Splitter.split("First|Second|Third|Fourth", '|')[3]);
		assertEquals("Lonly", Splitter.split("Lonly", '|')[0]);
	}
	
	@Test
	public final void simpleBackwardsSplitTest(){
		assertEquals(4, Splitter.split("First/Second/Third/Fourth", '/').length);
		assertEquals(3, Splitter.split("First/Second/Third", '/').length);
		assertEquals(0, Splitter.split("", '/').length);
		assertEquals("First", Splitter.split("First/Second/Third/Fourth", '/')[0]);
		assertEquals("Second", Splitter.split("First/Second/Third/Fourth", '/')[1]);
		assertEquals("Third", Splitter.split("First/Second/Third/Fourth", '/')[2]);
		assertEquals("Fourth", Splitter.split("First/Second/Third/Fourth", '/')[3]);
		assertEquals("Lonly", Splitter.split("Lonly", '/')[0]);
	}
	
	@Test
	public final void escapesSplitTest(){
		assertEquals(4, Splitter.split("First|Second|Third('|This|will|not|be|splitted|')|Fourth", '|', new char[]{'\''}).length);
		assertEquals(3, Splitter.split("First|Second|Third('|This|will|not|be|splitted|')", '|', new char[]{'\''}).length);
		assertEquals(0, Splitter.split("", '|', new char[]{'\''}).length);
		assertEquals("First", Splitter.split("First|Second('|This|will|not|be|splitted|')|Third|Fourth", '|', new char[]{'\''})[0]);
		assertEquals("Second('|This|will|not|be|splitted|')", Splitter.split("First|Second('|This|will|not|be|splitted|')|Third|Fourth", '|', new char[]{'\''})[1]);
		assertEquals("Third", Splitter.split("First|Second('|This|will|not|be|splitted|')|Third|Fourth", '|', new char[]{'\''})[2]);
		assertEquals("Fourth", Splitter.split("First('|This|will|not|be|splitted|')|Second|Third|Fourth", '|', new char[]{'\''})[3]);
		assertEquals("Lonly('|This|will|not|be|splitted|')", Splitter.split("Lonly('|This|will|not|be|splitted|')", '|', new char[]{'\''})[0]);
	}
	
	@Test
	public final void escapesNotIncludedSplitTest(){
		assertEquals(4, Splitter.splitIgnoreEscapes("First|Second|Third('|This|will|not|be|splitted|')|Fourth", '|', new char[]{'\''}).length);
		assertEquals(3, Splitter.splitIgnoreEscapes("First|Second|Third('|This|will|not|be|splitted|')", '|', new char[]{'\''}).length);
		assertEquals(0, Splitter.splitIgnoreEscapes("", '|', new char[]{'\''}).length);
		assertEquals("First", Splitter.splitIgnoreEscapes("First|Second('|This|will|not|be|splitted|')|Third|Fourth", '|', new char[]{'\''})[0]);
		assertEquals("Second(|This|will|not|be|splitted|)", Splitter.splitIgnoreEscapes("First|Second('|This|will|not|be|splitted|')|Third|Fourth", '|', new char[]{'\''})[1]);
		assertEquals("Third", Splitter.splitIgnoreEscapes("First|Second('|This|will|not|be|splitted|')|Third|Fourth", '|', new char[]{'\''})[2]);
		assertEquals("Fourth", Splitter.splitIgnoreEscapes("First('|This|will|not|be|splitted|')|Second|Third|Fourth", '|', new char[]{'\''})[3]);
		assertEquals("Lonly(|This|will|not|be|splitted|)", Splitter.splitIgnoreEscapes("Lonly('|This|will|not|be|splitted|')", '|', new char[]{'\''})[0]);
	}
}
