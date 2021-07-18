package com.azhya;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) {
		// prompt user to enter a word to hash
		// additional comments go here -AK
		// added github actions to project
		//hope this works
		//let's try again...
		System.out.println("Hello user!");
		String word = "myRealPassword";
		System.out.println("Please enter a super secret word: " + word);
		
		//hash the secret word
		String hashedPassword = new String();
		
		try {
			hashedPassword = passwordHasher(word);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// print results to user in console
		System.out.println("The secret word is now encrypted to: " + hashedPassword);
	}
	
	public static String passwordHasher(String word) throws NoSuchAlgorithmException {
		//check for empty string/null
		if(word.equals("") || word.equals(null)) {
			return "";
		}
		
		// generate salt
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		
		//configure the SHA-512 hash function with the salt
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(salt);
		
		//apply hash to my password & convert it to a string
		byte[] arr = md.digest(word.getBytes(StandardCharsets.UTF_8));
		String hashedPassword = new String(arr, StandardCharsets.UTF_8);
		
		// return the hashed password
		return hashedPassword;
	}

}
