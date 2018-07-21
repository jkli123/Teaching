package com.chee.jt1sectionc;

/**
 * This class represents a point in 2D space
 * with coordinates of x and y.
 * @author Chee Peng
 *
 */
public class Point {

	private int x;
	private int y;
	
	/**
	 * Constructs a point with coordinates {@code x} and
	 * coordinates {@code y}.
	 * @param x X-coordinate of point
	 * @param y Y-coordinate of point
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Returns x-coordinate of the point
	 * @return x-coordinate of point
	 */
	public int getX() {
		return x;
	}
	

	/**
	 * Returns y-coordinate of the point
	 * @return y-coordinate of point
	 */
	public int getY() {
		return y;
	}
	
}
