package com.chee.jt1sectionc;

/**
 * This class represents the main logic of the line gradient comparing
 * program. This class will get inputs from user and print out the necessary
 * messages
 * @author Chee Peng
 *
 */
public class LineLogic {

	public static final String INTERSECTING_MESSAGE = "The two lines are intersecting";
	public static final String PARALLEL_MESSAGE = "The two lines are parallel";
	public static final String OVERLAPPING_MESSAGE = "The two lines are overlapping";
	
	private Input input;
	private Point[] points;
	
	/**
	 * Constructs the main program and initializes the 
	 * number of points to get to 4 automatically.
	 */
	public LineLogic() {
		input = new Input();
		points = new Point[4];
	}
	
	/**
	 * Gets 4 points from user
	 */
	public void getPoints() {
		points = input.getPoints(4);
	}
	
	/**
	 * Calculates gradients of the lines from the points given by user.
	 * Prints out the corresponding messages - if the lines intersect,
	 * overlap or are parallel to one another.
	 */
	public void printRelationship() {
		Line AB = makeLine(points[0], points[1]);
		Line CD = makeLine(points[2], points[3]);
		Line AC = makeLine(points[0], points[2]);
		if(!GradientComparator.isGradientSame(AB, CD)) {
			System.out.println(INTERSECTING_MESSAGE);
		} else {
			if(GradientComparator.isGradientSame(AB, AC)) {
				System.out.println(OVERLAPPING_MESSAGE);
			} else {
				System.out.println(PARALLEL_MESSAGE);
			}
		}
	}
	
	/**
	 * A convenient factory producer method to construct lines to be used in this class.
	 * @param a First point of line
	 * @param b Second point of line
	 * @return A constructed line from {@value a} and {@value b}
	 */
	private Line makeLine(Point a, Point b) {
		return new Line(a, b);
	}
	
	public static void main(String[] args) {
		LineLogic logic = new LineLogic();
		logic.getPoints();
		logic.printRelationship();
	}
}
