package com.gf.util.string;
import static org.junit.Assert.*;

import org.junit.Test;

public final class CharsIteratorTest {
	@Test
	public final void CharIteratorTest(){
		final String str = "test string";
		final char[] arr = new char[str.length()];
		CharsIterator.iterate(str, new CharsIterator.CharConsumer() {
			@Override
			public void onChar(int index, char c, int length) {
				assertEquals(str.length(), length);
				assertEquals(str.charAt(index), c);
				arr[index] = c;
			}
		});
		assertEquals(str, new String(arr));
	}
}
