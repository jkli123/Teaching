package com.chee.javatest;

public class JT1V1B2 {

	public static void printString(int m) {
		String s = "";
		switch(m) {
			case(1):
				s = "one";
				break;
			case(2):
				s = "two";
				break;	
			case(3):
				s = "three";
				break;
			case(4) :
				s = "four";
				break;	
			case(5) :
				s = "five";
				break;
			case(6) :
				s = "six";
				break;
		}
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			JT1V1B2.printString(i);
		}
	}
}
