package com.chee.javatest;

public class JT1V1B1 {

	public static void printHigherLower(int n, int m) {
		if(n > m) {
			System.out.println("High");
		} else if(n < m) {
			System.out.println("Low");
		} else {
			System.out.println("Same");
		}
	}
	
	public static void main(String[] args) {
		JT1V1B1.printHigherLower(5, 90);
		JT1V1B1.printHigherLower(10, 90);
		JT1V1B1.printHigherLower(15, 90);
		JT1V1B1.printHigherLower(90, 90);
		JT1V1B1.printHigherLower(100, 90);
		JT1V1B1.printHigherLower(505, 90);
		
	}
}
