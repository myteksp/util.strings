package com.gf.util.string.encryption.exceptions;

public class WrongKeyException extends EncriptionException{
	private static final long serialVersionUID = 8943242964698441924L;

	public WrongKeyException(final String message) {
		super(message);
	}
	
	public WrongKeyException(final String messagepattern, final Object ...args) {
		super(messagepattern, args);
	}
}
