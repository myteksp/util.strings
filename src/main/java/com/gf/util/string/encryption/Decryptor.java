package com.gf.util.string.encryption;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import com.gf.util.string.encryption.Keys.Key;

public final class Decryptor {
	private final Cipher cipher;
	
	public Decryptor(final Key privateKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
		checkKey(privateKey);
		final String algorithm = privateKey.algorithm.toString();
		final KeyFactory kf = KeyFactory.getInstance(algorithm);
		this.cipher = Cipher.getInstance(algorithm);
		this.cipher.init(Cipher.DECRYPT_MODE, kf.generatePrivate(new PKCS8EncodedKeySpec(privateKey.toEncodedKey())));
	}
	
	public final byte[] decrypt(final byte[] data) {
		if (data == null)
			throw new NullPointerException("data can not be null");
		try {
			return cipher.doFinal(data);
		} catch (final Throwable t) {
			throw new RuntimeException(t);
		} 
	}
	
	public final String decrypt(final String data, final Charset charset) {
		if (data == null)
			throw new NullPointerException("data can not be null");
		
		return new String(decrypt(Base64.getUrlDecoder().decode(data)), charset);
	}
	
	public final String decrypt(final String data) {
		if (data == null)
			throw new NullPointerException("data can not be null");
		return decrypt(data, Charset.forName("UTF-8"));
	}
	
	private static final void checkKey(final Key privateKey) {
		if (privateKey == null)
			throw new NullPointerException("privateKey can not be null");
		if (privateKey.algorithm == null)
			throw new NullPointerException("privateKey.algorithm can not be null");
		if (privateKey.type == null)
			throw new NullPointerException("privateKey.type can not be null");
		if (privateKey.format == null)
			throw new NullPointerException("privateKey.format can not be null");
		if (privateKey.key == null)
			throw new NullPointerException("privateKey.key can not be null");
		if (privateKey.format.isEmpty())
			throw new RuntimeException("privateKey.format can not be empty");
		if (privateKey.key.isEmpty())
			throw new RuntimeException("privateKey.key can not be empty");
		switch(privateKey.type) {
		case PRIVATE:
			break;
		default:
			throw new RuntimeException("only 'publicKey.type==PRIVATE' are accepted to decryptor");
		}
		switch(privateKey.algorithm) {
		case RSA:
			break;
		default:
			throw new RuntimeException("only 'publicKey.algorithm==RSA' are accepted to encryptor");
		}
	}
	
	public static final Decryptor get(final Key privateKey) {
		try {
			return new Decryptor(privateKey);
		} catch (final Throwable e) {
			throw new RuntimeException(e);
		} 
	}
}
