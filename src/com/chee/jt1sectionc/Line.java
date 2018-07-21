package com.chee.jt1sectionc;

/**
 * This class represents a line in 2D geometry.
 * The line is represented by two points which the line
 * will cut through, resulting in a gradient, m and the point
 * in which the line crosses the y-axis, C.
 * This can be represented as the equation Y = mX + C
 * @author Chee Peng
 *
 */
public class Line {

	private Point p1;
	private Point p2;
	
	/**
	 * Constructs a line that will pass through the two points
	 * @param p1 Point 1 that line passes through
	 * @param p2 Point 2 that line passes through
	 */
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Returns the first point given that line will pass through
	 * @return First point given that line will pass through
	 */
	public Point getPointOne() {
		return p1;
	}
	

	/**
	 * Returns the second point given that line will pass through
	 * @return Second point given that line will pass through
	 */
	public Point getPointTwo() {
		return p2;
	}
	
	/**
	 * Calculates and returns the gradient of the line
	 * @return Gradient of line
	 */
	public double getGradient() {
		return ((double)p1.getY() - (double)p2.getY()) / ((double)p1.getX() - (double)p2.getX());
	}
}
