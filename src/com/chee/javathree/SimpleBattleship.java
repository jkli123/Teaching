package com.chee.javathree;

import java.util.Random;
import java.util.Scanner;

public class SimpleBattleship {

	private Random random;
	private Scanner sc;
	private int guess;
	private int battleshipStart;
	private int[] grid;
	
	/**
	 * Constructor to initialize all the fields of the class.
	 */
	public SimpleBattleship() {
		guess = 0;
		grid = new int[7];
		random = new Random();
		sc = new Scanner(System.in);
	}
	
	/**
	 * Only method that instance of the class has to call to
	 * begin the game.
	 */
	public void init() {
		generateBattleship();
		startGame();
	}
	
	/**
	 * Generates a random battleship and place it inside the gride.
	 */
	private void generateBattleship() {
		int ranNum = random.nextInt(5);
		battleshipStart = ranNum;
		for(int i = 0; i < 3; i++) {
			grid[i + ranNum] = 1;
		}
	}
	
	/**
	 * Checks if the battleship is hit.
	 * @param index The user's guess
	 * @return True if battleship is hit, false otherwise
	 */
	private boolean isBattleshipHit(int index) {
		return grid[index] == 1;
	}
	
	/**
	 * Checks if the battleship has sunk
	 * @return True if battleship has sunk, false otherwise
	 */
	private boolean isBattleshipSunk() {
		for(int i = 0; i < 3; i++) {
			if(grid[i + battleshipStart] == 1) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Extra Validation of input. If user types some other
	 * number not from 0 to 6, we will reject it
	 * @param num The user's input
	 * @return True if input is within the range of 0 to 6.
	 */
	private boolean isWithinRange(int num) {
		return num >= 0 && num <= 6;
	}
	
	/**
	 * Actual game logic. 
	 * Get user's input, validation, hit/miss and if the 
	 * battleship has sunk, game ends. Otherwise it continues
	 */
	private void startGame() {
		System.out.println("Welcome to battleship.");
		while(true) {
			System.out.print("Input a number from 0 to 6: ");
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				sc.nextLine();
				if(!isWithinRange(num)) {
					System.out.println("Please enter a valid number.");
					continue;
				}
				if(isBattleshipHit(num)) {
					System.out.println("Hit");
					grid[num] = 0;
					guess++;
				} else {
					System.out.println("Miss");
					guess++;
				}
				if(isBattleshipSunk()) {
					System.out.println("Battleship Sunked");
					break;
				}
			} else {
				System.out.println("Please provide a valid input.");
				sc.nextLine();
			}
		}
		endGame();
	}
	
	/**
	 * End of game. Prints out the user's total number of guesses.
	 */
	private void endGame() {
		System.out.println("Congratulations. You have sunked all ships");
		System.out.println("You took a total of: " + guess + " guess.");
	}

	public static void main(String[] args) {
		SimpleBattleship sbs = new SimpleBattleship();
		sbs.init();
	}
}
