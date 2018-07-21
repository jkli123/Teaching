package com.chee.jt1sectionc;

/**
 * This class is a utility class that will
 * aid in determining if gradients are the same.
 * This class should not be extended to be used for Comparators in Java
 * and the standard comaprators being used in Java.
 * @author Chee Peng
 *
 */
public class GradientComparator {

	private GradientComparator() {}
	
	/**
	 * Tetst if two lines have the same gradients
	 * @param l1 First line 
	 * @param l2 Second line
	 * @return True if {@code l1 and l2} have the same gradient, false otherwise
	 */
	public static boolean isGradientSame(Line l1, Line l2) {
		return l1.getGradient() == l2.getGradient();
	}
}
