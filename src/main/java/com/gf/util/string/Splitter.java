package com.gf.util.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Splitter {
	/**
	 * Splites string without consideration to any escape characters.
	 * @param input string to be splited.
	 * @param on delimiter of splitting
	 * @return splited string.
	 */
	public static final String[] split(final String input, final char on){
		final List<String> result = splitToList(input, on);
		return result.toArray(new String[result.size()]);
	}
	
	public static final String[] split(final String input, final String on){
		final List<String> result = splitToList(input, on);
		return result.toArray(new String[result.size()]);
	}
	
	public static final List<String> splitToList(final String input, final char on){
		final LinkedList<String> result = new LinkedList<String>();
		final StringBuilder[] sb = new StringBuilder[]{new StringBuilder(128)};
		CharsIterator.iterate(input, new CharsIterator.CharConsumer() {
			@Override
			public final void onChar(final int index, final char ch, final int length) {
				if (ch == on){
					if (sb[0].length() > 0)
						result.add(sb[0].toString());

					sb[0] = new StringBuilder(128);
				}else
					sb[0].append(ch);
			}
		});
		if (sb[0].length() > 0)
			result.add(sb[0].toString());

		return result;
	}
	
	public static final List<String> splitToList(final String input, final String on){
		final LinkedList<String> result = new LinkedList<String>();
		final char[] data = input.toCharArray();
		final char[] window = on.toCharArray();
		final int dlen = data.length;
		final int wlen = window.length;
		StringBuilder sb = new StringBuilder(dlen);
		
		for (int i = 0; i < dlen; i++) 
			if (isWindowMatched(i, data, window, wlen, dlen)) {
				i = i + wlen - 1;
				result.add(sb.toString());
				sb = new StringBuilder(dlen);
			} else 
				sb.append(data[i]);
		
		result.add(sb.toString());
		
		return result;
	}
	
	private static final boolean isWindowMatched(final int index, final char[] data, final char[] window, final int wlen, final int dlen) {
		if (index + wlen > dlen)
			return false;
		
		for (int i = 0; i < wlen; i++) 
			if (window[i] != data[index + i])
				return false;
		
		return true;
	}

	/**
	 * Splites string without consideration to any escape characters.
	 * Includes empty splitted elements.
	 * @param input string to be splited.
	 * @param on delimiter of splitting
	 * @return splited string.
	 */
	public static final String[] splitIncludeEmpty(final String input, final char on){
		final ArrayList<String> result = new ArrayList<String>();
		final StringBuilder[] sb = new StringBuilder[]{new StringBuilder(128)};
		CharsIterator.iterate(input, new CharsIterator.CharConsumer() {
			@Override
			public final void onChar(final int index, final char ch, final int length) {
				if (ch == on){
					result.add(sb[0].toString());
					sb[0] = new StringBuilder(128);
				}else
					sb[0].append(ch);
			}
		});
		result.add(sb[0].toString());
		return result.toArray(new String[result.size()]);
	}

	/**
	 * Splites string including escape characters 
	 * @param input string to be splited.
	 * @param on delimiter of splitting
	 * @param escapeCharacters array of characters between which the split character will be ignored.
	 * @return splited string.
	 */
	public static final String[] split(final String input, final char on, final char[] escapeCharacters){
		final ArrayList<String> result = new ArrayList<String>();
		final StringBuilder[] sb = new StringBuilder[]{new StringBuilder(128)};
		final int[] escapePointer = new int[]{0};
		CharsIterator.iterate(input, new CharsIterator.CharConsumer() {
			@Override
			public final void onChar(final int index, final char ch, final int length) {
				switch(escapePointer[0]){
				case 0:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0]++;
						sb[0].append(ch);
					}else{
						if (ch == on){
							if (sb[0].length() > 0)
								result.add(sb[0].toString());
							sb[0] = new StringBuilder(128);
						}else
							sb[0].append(ch);
					}
					break;
				default:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0] = 0;
						sb[0].append(ch);
					}else
						sb[0].append(ch);
					break;
				}
			}
		});
		if (sb[0].length() > 0)
			result.add(sb[0].toString());
		return result.toArray(new String[result.size()]);
	}


	/**
	 * Splites string including escape characters 
	 * Includes empty splitted elements.
	 * @param input string to be splited.
	 * @param on delimiter of splitting
	 * @param escapeCharacters array of characters between which the split character will be ignored.
	 * @return splited string.
	 */
	public static final String[] splitIncludeEmpty(final String input, final char on, final char[] escapeCharacters){
		final ArrayList<String> result = new ArrayList<String>();
		final StringBuilder[] sb = new StringBuilder[]{new StringBuilder(128)};
		final int[] escapePointer = new int[]{0};
		CharsIterator.iterate(input, new CharsIterator.CharConsumer() {
			@Override
			public final void onChar(final int index, final char ch, final int length) {
				switch(escapePointer[0]){
				case 0:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0]++;
						sb[0].append(ch);
					}else{
						if (ch == on){
							result.add(sb[0].toString());
							sb[0] = new StringBuilder(128);
						}else
							sb[0].append(ch);
					}
					break;
				default:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0] = 0;
						sb[0].append(ch);
					}else
						sb[0].append(ch);
					break;
				}
			}
		});
		result.add(sb[0].toString());
		return result.toArray(new String[result.size()]);
	}

	/**
	 * Splites string not including escape characters 
	 * @param input string to be splited.
	 * @param on delimiter of splitting
	 * @param escapeCharacters array of characters between which the split character will be ignored.
	 * @return splited string.
	 */
	public static final String[] splitIgnoreEscapes(final String input, final char on, final char[] escapeCharacters){
		final ArrayList<String> result = new ArrayList<String>();
		final StringBuilder[] sb = new StringBuilder[]{new StringBuilder(128)};
		final int[] escapePointer = new int[]{0};
		CharsIterator.iterate(input, new CharsIterator.CharConsumer() {
			@Override
			public final void onChar(final int index, final char ch, final int length) {
				switch(escapePointer[0]){
				case 0:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0]++;
					}else{
						if (ch == on){
							if (sb[0].length() > 0)
								result.add(sb[0].toString());
							sb[0] = new StringBuilder(128);
						}else
							sb[0].append(ch);
					}
					break;
				default:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0] = 0;
					}else
						sb[0].append(ch);
					break;
				}
			}
		});
		
		if (sb[0].length() > 0)
			result.add(sb[0].toString());
		return result.toArray(new String[result.size()]);
	}

	/**
	 * Splites string not including escape characters 
	 * Includes empty splitted elements.
	 * @param input string to be splited.
	 * @param on delimiter of splitting
	 * @param escapeCharacters array of characters between which the split character will be ignored.
	 * @return splited string.
	 */
	public static final String[] splitIgnoreEscapesIncludeEmpty(final String input, final char on, final char[] escapeCharacters){
		final ArrayList<String> result = new ArrayList<String>();
		final StringBuilder[] sb = new StringBuilder[]{new StringBuilder(128)};
		final int[] escapePointer = new int[]{0};
		CharsIterator.iterate(input, new CharsIterator.CharConsumer() {
			@Override
			public final void onChar(final int index, final char ch, final int length) {
				switch(escapePointer[0]){
				case 0:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0]++;
					}else{
						if (ch == on){
							result.add(sb[0].toString());
							sb[0] = new StringBuilder(128);
						}else
							sb[0].append(ch);
					}
					break;
				default:
					if (isInArray(ch, escapeCharacters)){
						escapePointer[0] = 0;
					}else
						sb[0].append(ch);
					break;
				}
			}
		});
		result.add(sb[0].toString());
		return result.toArray(new String[result.size()]);
	}

	private static final boolean isInArray(final char c, final char[] arr){
		final int len = arr.length;
		switch(len){
		case 0:
			return false;
		case 1:
			return c == arr[0];
		case 2:
			return c == arr[0] || c == arr[1];
		case 3:
			return c == arr[0] || c == arr[1] || c == arr[2];
		case 4:
			return c == arr[0] || c == arr[1] || c == arr[2] || c == arr[3];
		default:
			for(final char chr : arr)
				if (c == chr)
					return true;

			return false;
		}
	}
}
