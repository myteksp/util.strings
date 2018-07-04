package com.gf.util.string;


public final class CharsIterator {
	public static final void iterate(final String str, final CharConsumer consumer){
		if (str == null)
			return;
		final int len = str.length();
		for (int i = 0; i < len; i++)
			consumer.onChar(i, str.charAt(i), len);
	}
	
	public interface CharConsumer{
		void onChar(final int i, final char c, final int len);
	}
}
