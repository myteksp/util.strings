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

	public final GfString appendToBeggining(final String string) {
		return appendToBeggining(new GfString(string));
	}

	public final GfString appendToBeggining(final char ch) {
		return new GfString(new char[] {ch}, 0, 1, null, this);
	}

	public final GfString appendToBeggining(final char[] ch) {
		return new GfString(ch, 0, ch.length, null, this);
	}

	public final GfString appendToEnd(final GfString string) {
		return new GfString(empty_data, 0, 0, this, string);
	}

	public final GfString appendToEnd(final String string) {
		return appendToEnd(new GfString(string));
	}

	public final GfString appendToEnd(final char ch) {
		return new GfString(new char[] {ch}, 0, 1, this, null);
	}

	public final GfString appendToEnd(final char[] ch) {
		return new GfString(ch, 0, ch.length, this, null);
	}

	public final GfString append(final GfString string) {
		return appendToEnd(string);
	}

	public final GfString append(final String string) {
		return appendToEnd(string);
	}

	public final GfString append(final char ch) {
		return appendToEnd(ch);
	}

	public final GfString append(final char[] ch) {
		return appendToEnd(ch);
	}

	public final GfString subString(final int beginIndex, final int endIndex) {
		if (beginIndex < 0) {
			throw new StringIndexOutOfBoundsException(beginIndex);
		}
		if (endIndex > this.length()) {
			throw new StringIndexOutOfBoundsException(endIndex);
		}
		final int thisLen = this.length();
		if ((beginIndex == 0) && (endIndex == thisLen))
			return this;
		final int subLen = endIndex - beginIndex;
		if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
		
		if (begining == null && end == null) {
			return new GfString(data, beginIndex, subLen, null, null);
		} else {
			return new GfString(this.toString().substring(beginIndex, endIndex));
		}
	}

	public final int length() {
		final int b = begining == null?0:begining.length();
		final int e = end == null?0:end.length();
		return b + length + e;
	}

	private final String constructString() {
		final String b = begining == null?"":begining.toString();
		final String e = end == null?"":end.toString();
		switch(length) {
		case 0:
			return new StringBuilder(b.length() + e.length()).append(b).append(e).toString();
		default:
			final String d;
			if (start == 0 && length == data.length) {
				d = new String(data);
			} else {
				final char[] dst = new char[length];
				System.arraycopy(data, start, dst, 0, length);
				d = new String(dst);
			}
			return new StringBuilder(b.length() + e.length() + d.length()).append(b).append(d).append(e).toString();
		}
	}

	private volatile String toStringCache = null;
	@Override
	public final String toString() {
		final String res;
		if (toStringCache == null) 
			res = toStringCache = constructString();
		else
			res = toStringCache;
		return res;
	}
}
