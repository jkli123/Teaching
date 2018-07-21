package com.chee.javathree;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static final String firstMessage = "Welcome to Guessing My Number. \nIn this game, you will try"
			+ " to guess the number that me, the computer has thought of. \nThe range of the number is between"
			+ " 0 and 20. \nOnce you input your guess, you are correct or wrong. \nIf you are wrong, I will say"
			+ " higher or lower to prompt you closer towards the answer! Good Luck!";
	public static final String guessMessage = "Input a number: ";
	public static final String correctMessage = "Congratulations, you have guessed the number!";
	public static final String higherMessage = "Wrong number guessed. The number is lower";
	public static final String lowerMessage = "Wrong number guessed. The number is higher";
	public static final String wrongInputMessage = "Wrong type of input. I only accept numbers! Try again";
	public static final String quitMessage = "Do you wish to quit? Type Y to quit.\n"
			+ "Any other inputs will be taken as you do not wish to quit.";
	public static final String endMessage = "We are sad to see you go! Hope you had a great time guessing. Bye!";
	
	private Random random;
	private Scanner sc;
	private int numToGuess;
	
	public GuessingGame() {
		random = new Random();
		sc = new Scanner(System.in);
	}
	
	/**
	 * This method can be called to get a random number between a certain bound(not inclusive)
	 * @param bound The bound to generate number to, non-inclusive
	 * @return A randomly generated number between 0(inclusive) and bound(non-inclusive)
	 */
	private int generateRandomNumber(int bound) {
		return random.nextInt(bound);
	}
	
	/**
	 * Initialisation of the game.
	 * An instance of GuessingGame needs to start by calling this method first.
	 */
	public void init() {
		System.out.println(firstMessage);
		numToGuess = generateRandomNumber(21);
		startGame();
	}
	
	/**
	 * See if the num given is larger than the number to guess.
	 * @param num The number to check
	 * @return True if and only if the number is higher, false otherwise
	 */
	private boolean isNumberHigher(int num) {
		return num > numToGuess;
	}
	
	/**
	 * See if the num given is the same as the number to guess.
	 * @param num The number to check
	 * @return True if and only if the number if correct, false otherwise
	 */
	private boolean isNumberCorrect(int num) {
		return num == numToGuess;
	}
	
	/**
	 * Starts the actual game loop of the GuessingGame.
	 * Prints out the relevant messages at each point of the game.
	 * Takes user input, validate input and check to see if it is correct.
	 */
	private void startGame() {
		while(true) {
			System.out.print(guessMessage);
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				sc.nextLine();
				if(isNumberCorrect(num)) {
					System.out.println(correctMessage);
					break;
				}
				if(isNumberHigher(num)) {
					System.out.println(higherMessage);
				} else {
					System.out.println(lowerMessage);
				}
			} else {
				sc.nextLine();
				System.out.println(wrongInputMessage);
				continue;
			}
		}
		restartGame();
	}
	
	/**
	 * Called after user guesses the correct number.
	 * Checks if user wishes to quit/start a new game.
	 * 'Y' means user wishes to quit the game. 
	 * Any other input is regarded as starting a new game.
	 */
	private void restartGame() {
		System.out.println(quitMessage);
		String next = sc.nextLine();
		next = next.toLowerCase();
		if(next.equals("y")) {
			System.out.println(endMessage);
			return;
		}
		init();
	}
	
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		game.init();
	}
}
