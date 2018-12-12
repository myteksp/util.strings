package com.gf.util.string.encryption.exceptions;

public final class DecryptorCreationException extends EncriptionException{
	private static final long serialVersionUID = 3315200548284836385L;
	
	public final Throwable cause;
	
	public DecryptorCreationException(final Throwable cause) {
		super(cause.getMessage());
		this.cause = cause;
	}

}
