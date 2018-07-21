package com.chee.jt1sectionc;

import java.util.Scanner;

/**
 * This class aids in getting inputs from the user
 * on the points that they wish to test
 * @author Chee Peng
 *
 */
public class Input {

	private Scanner sc;
	
	/**
	 * Constructs a new input that will take input from user through
	 * System.in
	 */
	public Input() {
		sc = new Scanner(System.in);
	}
	
	/**
	 * Call this method to get {@code noOfPoint} from the user.
	 * The method will return an array of points back containing
	 * all the points the user has inputted.
	 * @param noOfPoint The number of points to ask for from user
	 * @return An array of all points user has inputted.
	 */
	public Point[] getPoints(int noOfPoint) {
		Point[] points = new Point[noOfPoint];
		for(int i = 0; i < noOfPoint; i++) {
			System.out.print("Enter the coordinates of point " + (i + 1) + ": ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			points[i] = new Point(x, y);
		}
		return points;
	}
}
