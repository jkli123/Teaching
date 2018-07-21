package com.chee.javathree;

public class FizzBuzz {

	
	private static boolean isMultipleOfThree(int num) {
		return num % 3 == 0;
	}
	
	private static boolean isMultipleOfFive(int num) {
		return num % 5 == 0;
	}
	
	private static boolean isMultipleOfThreeAndFive(int num) {
		return num % 5 == 0 && num % 3 == 0;
	}
	
	public static void printFizzBuzz() {
		for(int i = 1; i <= 100; i++) {
			if(isMultipleOfThreeAndFive(i)) {
				System.out.println("FizzBuzz");
			} else if(isMultipleOfFive(i)) {
				System.out.println("Buzz");
			} else if(isMultipleOfThree(i)) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		FizzBuzz.printFizzBuzz();
	}
}
