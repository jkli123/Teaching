package com.chee.javatest;

public class JT1V2B1 {

	public static void printIsPalindrome(String s) {
		//Initializes a variable to start of the array of characters in s
		int start = 0;
		//Initializes a variable to the end of the array of characters in s.
		int end = s.length() - 1;
		//Checks if these pointers to the array have passed each other.
		while(start < end) {
			//If the charAt the start and end are not equals, it is immediately not a palindrome
			if(s.charAt(start) != s.charAt(end)) {
				System.out.println("No");
				return;
			}
			//However, if charAt at start and end are equals, we continue and check
			start++;
			end--;
		}
		//Only if the pointers to array have passed each other have we checked the whole string
		//At this point, the string is definitely a palindrome as we have checked all the characters.
		System.out.println("Yes");
	}
	
	public static void main(String[] args) {
		String[] inputs = {"madam", "toy", "java", "bob"};
		for(String s : inputs) {
			JT1V2B1.printIsPalindrome(s);
		}
	}
}
