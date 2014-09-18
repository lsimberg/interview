package com.interview;

public class Test {
	public static boolean palindromeTest(String word){
		int length = word.length();
		for (int i=0; i< length/2; i++){
			if (word.charAt(i) != word.charAt(length - i - 1)) return false;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		String str = "ama";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));
		
		str = "love";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));
		
		str = "carac";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));
		
		str = "cabacc";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));
		
		str = "";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));

		str = "a";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));
		
		str = "eiie";
		System.out.println("The word " + str + " is a palindrome: " + palindromeTest(str));

	}

}
