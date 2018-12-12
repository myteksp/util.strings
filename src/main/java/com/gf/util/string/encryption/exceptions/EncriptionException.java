package com.gf.util.string.encryption.exceptions;

import com.gf.util.string.MC;

public class EncriptionException extends RuntimeException{
	private static final long serialVersionUID = -5983901654807346139L;
	public final String message;
	public EncriptionException(final String message) {
		super(message);
		this.message = message;
	}
	public EncriptionException(final String messagePattern, final Object ...args) {
		this(MC.fmt(messagePattern, args));
	}
	@Override
	public String toString() {
		return "EncriptionException [message=" + message + "]";
	}
}
