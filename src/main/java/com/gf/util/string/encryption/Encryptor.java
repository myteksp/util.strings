package com.gf.util.string.encryption;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import com.gf.util.string.encryption.Keys.Key;

public final class Encryptor {
	private final Cipher cipher;

	public Encryptor(final Key publicKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
		checkKey(publicKey);
		final String algorithm = publicKey.algorithm.toString();
		final KeyFactory kf = KeyFactory.getInstance(algorithm);
		this.cipher = Cipher.getInstance(algorithm);
		this.cipher.init(Cipher.ENCRYPT_MODE, kf.generatePublic(new X509EncodedKeySpec(publicKey.toEncodedKey())));
	}

	public final byte[] encrypt(final byte[] data) {
		if (data == null)
			throw new NullPointerException("data can not be null");
		try {
			return cipher.doFinal(data);
		} catch (final Throwable t) {
			throw new RuntimeException(t);
		} 
	}

	public final String encrypt(final String data, final Charset charset) {
		if (data == null)
			throw new NullPointerException("data can not be null");
		
		return Base64.getUrlEncoder().encodeToString(encrypt(data.getBytes(charset)));
	}
	
	public final String encrypt(final String data) {
		if (data == null)
			throw new NullPointerException("data can not be null");
		return encrypt(data, Charset.forName("UTF-8"));
	}

	private static final void checkKey(final Key publicKey) {
		if (publicKey == null)
			throw new NullPointerException("publicKey can not be null");
		if (publicKey.algorithm == null)
			throw new NullPointerException("publicKey.algorithm can not be null");
		if (publicKey.type == null)
			throw new NullPointerException("publicKey.type can not be null");
		if (publicKey.format == null)
			throw new NullPointerException("publicKey.format can not be null");
		if (publicKey.key == null)
			throw new NullPointerException("publicKey.key can not be null");
		if (publicKey.format.isEmpty())
			throw new RuntimeException("publicKey.format can not be empty");
		if (publicKey.key.isEmpty())
			throw new RuntimeException("publicKey.key can not be empty");
		switch(publicKey.type) {
		case PUBLIC:
			break;
		default:
			throw new RuntimeException("only 'publicKey.type==PUBLIC' are accepted to encryptor");
		}
		switch(publicKey.algorithm) {
		case RSA:
			break;
		default:
			throw new RuntimeException("only 'publicKey.algorithm==RSA' are accepted to encryptor");
		}
	}
	
	public static final Encryptor get(final Key publicKey) {
		try {
			return new Encryptor(publicKey);
		} catch (final Throwable e) {
			throw new RuntimeException(e);
		} 
	}
}
