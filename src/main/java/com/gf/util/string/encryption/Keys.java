package com.gf.util.string.encryption;

import java.nio.ByteBuffer;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;
import com.gf.util.string.JSON;

public final class Keys {

	private static final byte[] randomSeed() {
		final long l1 = System.currentTimeMillis();
		final long l2 = System.nanoTime();
		final double l3 = Math.random();
		final double dist = Math.random();
		final ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES + Long.BYTES + Double.BYTES + Double.BYTES);
		if (dist > 0.7) {
			buffer.putLong(l1);
			buffer.putLong(l2);
			buffer.putDouble(l3);
		}else if(dist > 0.4) {
			buffer.putLong(l2);
			buffer.putDouble(l3);
			buffer.putLong(l1);
		}else {
			buffer.putDouble(l3);
			buffer.putLong(l1);
			buffer.putLong(l2);
		}
		buffer.putDouble(dist);
		return buffer.array();
	}

	public static final KeyPair createKeyPair() {
		try {
			return createKeyPair(3072, Algorithm.RSA);
		} catch (final NoSuchAlgorithmException e) {
			return null;
		}
	}
	
	public static final KeyPair createKeyPair(final int len) {
		try {
			return createKeyPair(len, Algorithm.RSA);
		} catch (final NoSuchAlgorithmException e) {
			return null;
		}
	}

	public static final KeyPair fromJson(final String json){
		try {
			return JSON.fromJson(json, KeyPair.class);
		}catch(final Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static final KeyPair createKeyPair(final int len, final Algorithm algorithm) throws NoSuchAlgorithmException {
		final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm.toString());
		keyGen.initialize(len, new SecureRandom(randomSeed()));
		final java.security.KeyPair pair = keyGen.generateKeyPair();
		final PrivateKey privateKey = pair.getPrivate();
		final PublicKey publicKey = pair.getPublic();
		
		final KeyPair res = new KeyPair();
		final Key prvt = res.privateKey = new Key();
		final Key pblc = res.publicKey = new Key();
		prvt.type = KeyType.PRIVATE;
		pblc.type = KeyType.PUBLIC;
		pblc.algorithm = prvt.algorithm = algorithm;
		prvt.format = privateKey.getFormat();
		pblc.format = publicKey.getFormat();
		prvt.key = encodeKey(privateKey.getEncoded());
		pblc.key = encodeKey(publicKey.getEncoded());
		return res;
	}
	
	private static final String encodeKey(final byte[] key) {
		return Base64.getUrlEncoder().encodeToString(key);
	}
	
	private static final byte[] decodeKey(final String key) {
		return Base64.getUrlDecoder().decode(key);
	}
	

	public static enum Algorithm{
		DSA, RSA, EC, DH
	}

	public static final class KeyPair {
		public Key privateKey;
		public Key publicKey;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((privateKey == null) ? 0 : privateKey.hashCode());
			result = prime * result + ((publicKey == null) ? 0 : publicKey.hashCode());
			return result;
		}
		@Override
		public final boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final KeyPair other = (KeyPair) obj;
			if (privateKey == null) {
				if (other.privateKey != null)
					return false;
			} else if (!privateKey.equals(other.privateKey))
				return false;
			if (publicKey == null) {
				if (other.publicKey != null)
					return false;
			} else if (!publicKey.equals(other.publicKey))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "KeyPair [privateKey=" + privateKey + ", publicKey=" + publicKey + "]";
		}
		public final String toJson() {
			return JSON.toJson(this);
		}
		public final String toPrettyJson() {
			return JSON.toPrettyJson(this);
		}
	}
	
	public static final class Key{
		public KeyType type;
		public Algorithm algorithm;
		public String format;
		public String key;
		
		public final byte[] toEncodedKey() {
			return decodeKey(key);
		}
		
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((algorithm == null) ? 0 : algorithm.hashCode());
			result = prime * result + ((format == null) ? 0 : format.hashCode());
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}
		@Override
		public final boolean equals(final Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final Key other = (Key) obj;
			if (algorithm == null) {
				if (other.algorithm != null)
					return false;
			} else if (!algorithm.equals(other.algorithm))
				return false;
			if (format == null) {
				if (other.format != null)
					return false;
			} else if (!format.equals(other.format))
				return false;
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			if (type != other.type)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Key [type=" + type + ", algorithm=" + algorithm + ", format=" + format + ", key=" + key + "]";
		}
	}
	
	public static enum KeyType{
		PRIVATE, PUBLIC
	}
}
