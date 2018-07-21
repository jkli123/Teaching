package com.chee.javathree;

import java.util.Random;

public class Recap3Ans {

	Random random = new Random();
	
	public double sigmoid(double x) {
		return 1 / (1 + Math.exp(-x));
	}
	
	public boolean isAbove(double output) {
		return output >= 0.473;
	}
	
	public double generateRandomDouble() {
		return random.nextDouble() * 4.0 - 2.0;
	}
	
	public void test() {
		for(int i = 0; i < 10; i++) {
			double sigmoidOutput = sigmoid(generateRandomDouble());
			System.out.println("Sigmoid Output is: " + sigmoidOutput);
			if(isAbove(sigmoidOutput)) {
				System.out.println("Fire");
			} else {
				System.out.println("No Fire");
			}
		}
	}
	
	public static void main(String[] args) {
		Recap3Ans a = new Recap3Ans();
		a.test();
	}
}
