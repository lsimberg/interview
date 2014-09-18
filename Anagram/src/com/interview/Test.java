package com.interview;

import java.util.Arrays;

public class Test {
	
	/*
	 * The solution is using sort and comparison, but we can use 
	 * the count letter algorithm 
	 */
	public static boolean testAnagram(String word1, String word2){
		if (word1.length() != word2.length()) return false;
		
		char[] chars1 = word1.toLowerCase().toCharArray();
		char[] chars2 = word2.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return ((new String(chars1)).equals(new String(chars2)));

// or using instand the return	
//		for (int i = 0; i< chars1.length; i++){
//			if (chars1[i] != chars2[i]) return false;
//		}
//		return true;
	}
	
	
	public static void main(String[] args) {
		String str1 = "ama";
		String str2 = "aam";
		System.out.println("The word " + str1 + " and the word " + str2 + " are anagrams: " + testAnagram(str1, str2));

		str1 = "amae";
		str2 = "aam";
		System.out.println("The word " + str1 + " and the word " + str2 + " are anagrams: " + testAnagram(str1, str2));

		str1 = "amar";
		str2 = "aamr";
		System.out.println("The word " + str1 + " and the word " + str2 + " are anagrams: " + testAnagram(str1, str2));

		str1 = "amaasdr";
		str2 = "maadars";
		System.out.println("The word " + str1 + " and the word " + str2 + " are anagrams: " + testAnagram(str1, str2));
}

}
