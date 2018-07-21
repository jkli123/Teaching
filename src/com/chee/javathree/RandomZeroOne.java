package com.chee.javathree;

import java.util.Arrays;
import java.util.Random;

public class RandomZeroOne {

	Random random;
	int[] zeroOne;
	
	
	public RandomZeroOne() {
		random = new Random();
		zeroOne = new int[20];
	}
	
	public void generateRandomZeroOne() {
		for(int i = 0; i < zeroOne.length; i++) {
			zeroOne[i] = random.nextInt(2);
		}
		System.out.println("Random array: " + Arrays.toString(zeroOne));
	}
	
	public void separate() {
		int zero = 0;
		for(int i = 0; i < zeroOne.length; i++) {
			if(zeroOne[i] == 0) {
				zero++;
			}
		}
		for(int i = 0; i < zero; i++) {
			zeroOne[i] = 0;
		}
		for(int i = zero; i < zeroOne.length; i++) {
			zeroOne[i] = 1;
		}
		System.out.println("Separated array: " + Arrays.toString(zeroOne));
	}
	
	
	public static void main(String[] args) {
		RandomZeroOne zo = new RandomZeroOne();
		zo.generateRandomZeroOne();
		zo.separate();
	}
}
