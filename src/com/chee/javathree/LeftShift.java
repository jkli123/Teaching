package com.chee.javathree;

import java.util.Arrays;

public class LeftShift {

	
	public static int[] shift(int[] a) {
		int[] result = new int[a.length];
		int first = a[0];
		for(int i = 0; i < a.length - 1; i++) {
			result[i] = a[i + 1];
		}
		result[a.length - 1] = first;
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] test1 = new int[] {6,2,5,3};
		int[] test2 = new int[] {1,2};
		int[] test3 = new int[] {1};
		
		System.out.println(Arrays.toString(LeftShift.shift(test1)));
		System.out.println(Arrays.toString(LeftShift.shift(test2)));
		System.out.println(Arrays.toString(LeftShift.shift(test3)));
	}
}
