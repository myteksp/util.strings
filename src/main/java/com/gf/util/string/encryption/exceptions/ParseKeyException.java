package com.gf.util.string.encryption.exceptions;

public final class ParseKeyException extends EncriptionException{
	private static final long serialVersionUID = -5533340419652969404L;
	
	public final Throwable throwable;
	
	public ParseKeyException(final Throwable throwable) {
		super(throwable.getMessage());
		this.throwable = throwable;
	}
}
