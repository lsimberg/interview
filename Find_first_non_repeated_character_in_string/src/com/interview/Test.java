package com.interview;

import java.util.HashMap;
import java.util.Map;

/*
	we need to write an algorithm for  the first non repeated character in a string , for example
		If the word "stress" is input  then it should print  't'   as output .
		If the word "teeter" is input  then it should print  'r'   as output .
 */

public class Test {

	public static char find(String str){
		Map <Character, Integer> map = new HashMap<Character, Integer>();
		for (int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			Integer n = map.get(c);
			if (n==null){
				map.put(c, 1);
			} else {
				n++;
				map.put(c, n);
			}
		}
		for (int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if (map.get(c) == 1) return c;
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		String str = "stress"; 
		System.out.println("the first non repeated character for " + str + " is: " + find(str));

		str = "teeter"; 
		System.out.println("the first non repeated character for " + str + " is: " + find(str));

		str = "aaa"; 
		System.out.println("the first non repeated character for " + str + " is: " + find(str));

		str = "Hi"; 
		System.out.println("the first non repeated character for " + str + " is: " + find(str));
	}
	
}
