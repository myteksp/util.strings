package com.gf.util.string.encryption;

import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.gf.util.string.JSON;

public final class Keys {

	private static final byte[] toLongArray(final long l1, final long l2) {
		final ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES + Long.BYTES);
		buffer.putLong(l1);
		buffer.putLong(l2);
		return buffer.array();
	}

	private static final byte[] randomSeed() {
		if (Math.random() > 0.5)
			return toLongArray(System.currentTimeMillis(), System.nanoTime());
		else
			return toLongArray(System.nanoTime(), System.currentTimeMillis());
	}

	public static final KeyPair createKeyPair() {
		try {
			return createKeyPair(2048, Algorithm.RSA);
		} catch (final NoSuchAlgorithmException e) {
			return null;
		}
	}

	private static final Map<String, String> toString(final PrivateKey privateKey) {
		if (privateKey == null)
			return new HashMap<String, String>(0);
		final Map<String, String> res = new HashMap<String, String>(3);
		res.put("algorithm", privateKey.getAlgorithm());
		res.put("format", privateKey.getFormat());
		res.put("key", Base64.getUrlEncoder().encodeToString(privateKey.getEncoded()));
		return res;
	}

	private static final Map<String, String> toString(final PublicKey publicKey) {
		if (publicKey == null)
			return new HashMap<String, String>(0);
		final Map<String, String> res = new HashMap<String, String>(3);
		res.put("algorithm", publicKey.getAlgorithm());
		res.put("format", publicKey.getFormat());
		res.put("key", Base64.getUrlEncoder().encodeToString(publicKey.getEncoded()));
		return res;
	}

	private static final PrivateKey toPrivate(final Map<String, String> map) throws Throwable {
		return KeyFactory.getInstance(map.get("algorithm")).generatePrivate(new PKCS8EncodedKeySpec(Base64.getUrlDecoder().decode(map.get("key"))));
	}

	private static final PublicKey toPublic(final Map<String, String> map) throws Throwable {
		return KeyFactory.getInstance(map.get("algorithm")).generatePublic(new X509EncodedKeySpec(Base64.getUrlDecoder().decode(map.get("key"))));
	}

	public static final KeyPair fromJson(final String json){
		try {
			final _keyPairObj obj = JSON.fromJson(json, _keyPairObj.class);
			return new KeyPair() {
				private final PrivateKey privateKey = toPrivate(obj.get("private"));
				private final PublicKey publicKey = toPublic(obj.get("public"));
				@Override
				public final PublicKey getPublic() {
					return publicKey;
				}
				@Override
				public final PrivateKey getPrivate() {
					return privateKey;
				}
				@Override
				public final String toString() {
					final Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>(3);
					map.put("private", Keys.toString(privateKey));
					map.put("public", Keys.toString(publicKey));
					return JSON.toJson(map);
				}
			};
		}catch(final Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static final KeyPair createKeyPair(final int len, final Algorithm algorithm) throws NoSuchAlgorithmException {
		final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm.toString());
		keyGen.initialize(len, new SecureRandom(randomSeed()));
		final java.security.KeyPair pair = keyGen.generateKeyPair();
		return new KeyPair() {
			private final PrivateKey privateKey = pair.getPrivate();
			private final PublicKey publicKey = pair.getPublic();
			@Override
			public final PrivateKey getPrivate() {
				return privateKey;
			}
			@Override
			public final PublicKey getPublic() {
				return publicKey;
			}
			@Override
			public final String toString() {
				final Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>(3);
				map.put("private", Keys.toString(privateKey));
				map.put("public", Keys.toString(publicKey));
				return JSON.toJson(map);
			}
		};
	}

	public static enum Algorithm{
		DSA, RSA, EC, DH
	}

	public static interface KeyPair {
		PrivateKey getPrivate();
		PublicKey getPublic();
	}

	public static final class _keyPairObj extends HashMap<String, Map<String, String>> implements Map<String, Map<String, String>>{
		private static final long serialVersionUID = -5183653179350382169L;
	}
}
