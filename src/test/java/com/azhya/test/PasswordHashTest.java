package com.azhya.test;

import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import com.azhya.Main;

public class PasswordHashTest {

	@Test
	public void normalTest() {
		String testWord = "test";
		try {
			String hashedWord = Main.passwordHasher(testWord);
			Assert.assertNotEquals("password should not be matching hash", testWord, hashedWord);
			System.out.println("Password hash test completed.");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void emptyValueTest() {
		String testWord = "";
		try {
			String hashedWord = Main.passwordHasher(testWord);
			System.out.println(hashedWord);
			Assert.assertTrue("password should be empty", hashedWord.equals(""));
			System.out.println("Empty password hash test completed.");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
