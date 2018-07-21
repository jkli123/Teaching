package com.chee.javatest;

import java.util.Arrays;

public class JT1V2B2 {

	public static void printMinMax(int[] fiveNum) {
		//Initializes a variable to stores all the sums calculated
		int[] store = new int[fiveNum.length];
		//For each number a
		for(int i = 0; i < fiveNum.length; i++) {
			//Create a sum variable
			int sum = 0;
			//Excluding the number a, 
			for(int j = 0; j < fiveNum.length; j++) {
				if(j != i) {
					//Add all the rest of the 4 integers to variable sum.
					sum += fiveNum[j];
				}
			}
			//Store it inside the storage variable
			store[i] = sum;
		}
		//Sort the storage variable with all the sums
		Arrays.sort(store);
		//and print out the first(min) and the last(max) of the storage.
		System.out.println(store[0] + " " + store[fiveNum.length - 1]);
	}
	
	//Overloaded method for long arrays. Same logic used.
	public static void printMinMax(long[] fiveNum) {
		long[] store = new long[fiveNum.length];
		for(int i = 0; i < fiveNum.length; i++) {
			long sum = 0;
			for(int j = 0; j < fiveNum.length; j++) {
				if(j != i) {
					sum += fiveNum[j];
				}
			}
			store[i] = sum;
		}
		Arrays.sort(store);
		System.out.println(store[0] + " " + store[fiveNum.length - 1]);
	}
	
	public static void main(String[] args) {
		int[] input1 = {1,2,3,4,5};
		int[] input2 = {4,5,6,8,10};
		//Note that if input3 is created using int, integer overflow will happen as 
		//the addition results in a number larger than the possible amount to hold in int.
		int[] input3 = {2100000000, 20000, 100000000,20, 100000000};
		//You must use a 64bit integer type, long in order to prevent this.
		long[] input4 = {2100000000, 20000, 100000000,20, 100000000};
		JT1V2B2.printMinMax(input1);
		JT1V2B2.printMinMax(input2);
		System.out.print("Integer overflow happends here ");
		JT1V2B2.printMinMax(input3);
		System.out.print("Solved if the type long is used " );
		JT1V2B2.printMinMax(input4);
	}
}
