package com.interview;


/*
 * In this post we will see how to reverse number in java.
 * Ex: If input is 713 then reverse of 713 should be 317.
 */

public class Test {
	public static int reverseNumber(int number){
		int reverse = 0;
		while(number != 0){
			int remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number /= 10;
		}
		
		return reverse;
	}
	
	
	public static void main(String[] args) {
		int number = 713;
		System.out.println("the reverse of " + number + " is " + reverseNumber(number));

		number = 3;
		System.out.println("the reverse of " + number + " is " + reverseNumber(number));

		number = 713234;
		System.out.println("the reverse of " + number + " is " + reverseNumber(number));

		number = 0;
		System.out.println("the reverse of " + number + " is " + reverseNumber(number));

		number = 26;
		System.out.println("the reverse of " + number + " is " + reverseNumber(number));

		number = -713;
		System.out.println("the reverse of " + number + " is " + reverseNumber(number));
}

}
