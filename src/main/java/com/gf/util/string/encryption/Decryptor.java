package com.gf.util.string.encryption;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

import com.gf.util.string.encryption.Keys.Key;
import com.gf.util.string.encryption.exceptions.DecryptorCreationException;
import com.gf.util.string.encryption.exceptions.WrongKeyException;

public final class Decryptor {
	private final Cipher cipher;
	public Decryptor(final Key privateKey){
		try {
			checkKey(privateKey);
			final String algorithm = privateKey.algorithm.toString();
			final KeyFactory kf = KeyFactory.getInstance(algorithm);
			this.cipher = Cipher.getInstance(algorithm);
			this.cipher.init(Cipher.DECRYPT_MODE, kf.generatePrivate(new PKCS8EncodedKeySpec(privateKey.toEncodedKey())));
		}catch(final Throwable t) {
			throw new DecryptorCreationException(t);
		}
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
		return decrypt(data, StandardCharsets.UTF_8);
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
			throw new WrongKeyException("privateKey.format can not be empty");
		if (privateKey.key.isEmpty())
			throw new WrongKeyException("privateKey.key can not be empty");
		if (privateKey.type != Keys.KeyType.PRIVATE) {
			throw new RuntimeException("only 'publicKey.type==PRIVATE' are accepted to decryptor");
		}
		if (privateKey.algorithm != Keys.Algorithm.RSA) {
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
