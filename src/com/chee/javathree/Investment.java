package com.chee.javathree;

public class Investment {
	
	int principal;
	int interest;
	int years;
	int inflation;
	
	public Investment(int principal, int interest, int years, int inflation) {
		this.principal = principal;
		this.interest = interest;
		this.years = years;
		this.inflation = inflation;
	}
	
	public double calculateInterest() {
		double totalAmount = principal;
		
		for(int i = 0; i < years; i++) {
			totalAmount = totalAmount / 100.0 * (100.0 + interest);
		}
		
		return totalAmount - principal;
	}
	
	public double calculateInflation() {
		return principal / 100 * (100 + inflation) - principal;
	}
	
	public boolean isWorth(double totalEarned, double totalInflated) {
		return totalEarned >= totalInflated;
	}
	
	public void printOutput() {
		double totalInterest = calculateInterest();
		double totalInflated = calculateInflation();
		if(isWorth(totalInterest, totalInflated)) {
			System.out.println("The investment is worth it");
		} else {
			System.out.println("The investment is not worth it.");
		}
		System.out.println("Total inflated amount at the end of " + years
				+ " years is $" + totalInflated);
		System.out.println("Total amount of interest earned at the end of " + years
				+ " years is $" + totalInterest);
	}
	
	public static void main(String[] args) {
		Investment inv = new Investment(100, 2, 5, 3);
		inv.printOutput();
		Investment inv2 = new Investment(100, 1, 7, 10);
		inv2.printOutput();
	}
}
