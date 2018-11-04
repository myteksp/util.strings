package com.gf.util.string;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import com.gf.util.string.encryption.Keys;

public class KeysTest {
	@Test
	public final void simpleKeyTest(){
		final int len = 5;
		System.out.println("Warming up");
		for (int i = 0; i < len; i++) {
			Keys.createKeyPair().toString();
		}
		System.out.println("Warming up - DONE.");
		final long time = System.currentTimeMillis();
		for (int i = 0; i < len; i++) {
			Keys.createKeyPair();
		}
		System.out.println("Time for " + len + " keys:" + (System.currentTimeMillis() - time));
		for (int i = 0; i < 10; i++) {
			System.out.println(Keys.createKeyPair().toString());
		}
	}
	
	@Test
	public final void algorithmsKeyTest() throws NoSuchAlgorithmException{
		System.out.println("DH" + Keys.createKeyPair(512, Keys.Algorithm.DH).toString());
		System.out.println("DSA" + Keys.createKeyPair(1024, Keys.Algorithm.DSA).toString());
		System.out.println("EC" + Keys.createKeyPair(128, Keys.Algorithm.EC).toString());
		System.out.println("RSA" + Keys.createKeyPair(1024, Keys.Algorithm.RSA).toString());
	}
	
	@Test
	public final void serializationTest() throws NoSuchAlgorithmException{
		System.out.println("Parsed - DH" + Keys.fromJson(Keys.createKeyPair(512, Keys.Algorithm.DH).toString()).toString());
		System.out.println("Parsed - DSA" + Keys.fromJson(Keys.createKeyPair(1024, Keys.Algorithm.DSA).toString()).toString());
		System.out.println("Parsed - EC" + Keys.fromJson(Keys.createKeyPair(128, Keys.Algorithm.EC).toString()).toString());
		System.out.println("Parsed - RSA" + Keys.fromJson(Keys.createKeyPair(1024, Keys.Algorithm.RSA).toString()).toString());
	}
}
