package com.gf.util.string;

public final class GfString {
	private static final char[] empty_data = new char[] {};
	
	private final char[] data;
	private final int start;
	private final int length;
	private final GfString begining;
	private final GfString end;
	
	private GfString(final char[] data, final int start, final int length, final GfString begining, final GfString end) {
		this.data = data;
		this.start = start;
		this.length = length;
		this.begining = begining;
		this.end = end;
	}
	
	private GfString(final String string, final GfString begining, final GfString end) {
		this.data = string.toCharArray();
		this.start = 0;
		this.length = data.length;
		this.begining = null;
		this.end = null;
	}
	
	public GfString(final String string) {
		this(string, null, null);
	}
	
	public GfString() {
		this(empty_data, 0, 0, null, null);
	}
	
	public final GfString appendToBeggining(final GfString string) {
		return new GfString(empty_data, 0, 0, string, this);
	}
	
	public final GfString appendToEnd(final GfString string) {
		return new GfString(empty_data, 0, 0, this, string);
	}
	
	public final int length() {
		final int b = begining == null?0:begining.length();
		final int e = end == null?0:end.length();
		return b + length + e;
	}

	@Override
	public final String toString() {
		final String b = begining == null?"":begining.toString();
		final String e = end == null?"":end.toString();
		if (length == 0) {
			return new StringBuilder(b.length() + e.length()).append(b).append(e).toString();
		}else {
			final char[] dst = new char[length];
			System.arraycopy(data, start, dst, 0, length);
			final String d = new String(dst);
			return new StringBuilder(b.length() + e.length() + d.length()).append(b).append(d).append(e).toString();
		}
	}
}
