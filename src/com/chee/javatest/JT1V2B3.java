package com.chee.javatest;

public class JT1V2B3 {

	//A constant array to store all vowels.
	public static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
	
	public static boolean isVowel(char c) {
		//Checks against the constant array to see if the character c is a vowel.
		for(char vowel : VOWELS) {
			if(vowel == c) {
				return true;
			}
		}
		return false;
	}
	
	public static void printNoVowel(String s) {
		//Ensures that all letters are lower-cased before proceeding
		s = s.toLowerCase();
		//Initializes a variable to store number of vowels.
		int vowel = 0;
		//For each character inside string, if it is a vowel, increase the variable
		for(char c : s.toCharArray()) {
			if(JT1V2B3.isVowel(c)) {
				vowel++;
			}
		}
		//At the end, print out the number of vowels.
		System.out.println(vowel);
	}
	
	
	public static void main(String[] args) {
		String[] inputs = {"cOurSe", "OuTliNe", "EffectIve", "VoWeLs", "sHhh" };
		for(String s : inputs) {
			JT1V2B3.printNoVowel(s);
		}
	}
}
