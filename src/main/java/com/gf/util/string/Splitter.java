package com.gf.util.string;

import java.util.ArrayList;

public final class Splitter {
	public static final String[] split(final String input, final char on){
		final ArrayList<String> result = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		final char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			final char ch = arr[i];
			if (ch == on){
				result.add(sb.toString());
				sb = new StringBuilder();
			}else
				sb.append(ch);
		}
		result.add(sb.toString());
		return result.toArray(new String[result.size()]);
	}

	public static final String[] split(final String input, final char on, final char[] escapeCharacters){
		final ArrayList<String> result = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		final char[] arr = input.toCharArray();
		int escapePointer = 0;
		for (int i = 0; i < arr.length; i++) {
			final char ch = arr[i];
			switch(escapePointer){
			case 0:
				if (isInArray(ch, escapeCharacters)){
					escapePointer++;
					sb.append(ch);
				}else{
					if (ch == on){
						if (sb.length() > 0)
							result.add(sb.toString());
						sb = new StringBuilder();
					}else
						sb.append(ch);
				}
				break;
			default:
				if (isInArray(ch, escapeCharacters)){
					escapePointer = 0;
					sb.append(ch);
				}else
					sb.append(ch);
				break;
			}

		}
		if (sb.length() > 0)
			result.add(sb.toString());
		return result.toArray(new String[result.size()]);
	}
	
	public static final String[] split1(final String input, final char on, final char[] escapeCharacters){
		final ArrayList<String> result = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		final char[] arr = input.toCharArray();
		int escapePointer = 0;
		for (int i = 0; i < arr.length; i++) {
			final char ch = arr[i];
			switch(escapePointer){
			case 0:
				if (isInArray(ch, escapeCharacters)){
					escapePointer++;
				}else{
					if (ch == on){
						if (sb.length() > 0)
							result.add(sb.toString());
						sb = new StringBuilder();
					}else
						sb.append(ch);
				}
				break;
			default:
				if (isInArray(ch, escapeCharacters)){
					escapePointer = 0;
				}else
					sb.append(ch);
				break;
			}

		}
		if (sb.length() > 0)
			result.add(sb.toString());
		return result.toArray(new String[result.size()]);
	}

	private static final boolean isInArray(final char c, final char[] arr){
		for(final char chr : arr)
			if (c == chr)
				return true;

		return false;
	}
}
