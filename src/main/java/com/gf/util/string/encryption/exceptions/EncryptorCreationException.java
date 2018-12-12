package com.gf.util.string.encryption.exceptions;

public final class EncryptorCreationException extends EncriptionException{
	private static final long serialVersionUID = 5555803371451624529L;

	public final Throwable cause;
	
	public EncryptorCreationException(final Throwable cause) {
		super(cause.getMessage());
		this.cause = cause;
	}
}
