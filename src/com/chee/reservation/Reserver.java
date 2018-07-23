package com.chee.reservation;

import java.util.Scanner;

import com.chee.hotel.*;

/**
 * This class represents a reservation system that
 * is command-line based where the customers will
 * input the room numbers to signify which rooms they
 * wish to book. Basic details of the rooms are provided
 * when given the selection.
 * 
 *  The reserver is also capable of not displaying the
 *  rooms which are reserved.
 *  
 *  The reserver will end once user types 'exit'
 *  or if there are no rooms to be booked.
 * 
 * @author Chee Peng
 *
 */
public class Reserver {

	private Scanner sc;
	private Hotel hotel;
	
	public Reserver(Hotel hotel) {
		sc = new Scanner(System.in);
		this.hotel = hotel;
	}
	
	public void displayChoices() {
		for(Room r : hotel.getAllRooms()) {
			if(!r.getIsReserved()) {
				System.out.println(r);	
			}
		}
	}
	
	public void init() {
		while(true) {
			if(hotel.isHotelFull()) {
				break;
			}
			displayChoices();
			System.out.print("Please input the room no. you wish to book.\n"
					+ "If you wish to quit the reserver, type exit.> ");
			String choice = sc.nextLine();
			if(isExit(choice)) {
				System.out.println("Thank you for using the reserver. Hope to"
						+ " see you again.");
				return;
			}
			if(validateInput(choice)) {
				int roomNo = Integer.parseInt(choice);
				if(hotel.bookRoom(roomNo)) {
					System.out.println("Your room has been booked. Enjoy your stay.");			
				} else {
					System.out.println("Your booking has failed. Input a room number within our range.");	
				}
			} else {
				System.out.println("We only accept valid inputs of numbers within our room numbers.");
				continue;
			}
		}
		System.out.println("Sadly, it seems like we are fully booked, please try again later.");
	}
	
	private boolean validateInput(String s) {
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isExit(String s) {
		String exit = s.toLowerCase();
		if(exit.trim().equals("exit")) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Item one = new Item("Bed", 100);
		Item two = new Item("Bed", 100);
		Item three = new Item("Bed", 100);
		Item four = new Item("Fridge", 50);
		Item five = new Item("Television", 40);
		Room r = new BasicRoom("Three Bed Basic Room", 1, one, two, three, four, five);
		Room f = new FamilyRoom("Three Bed Family Room", 2, one, two, three, four, five);
		Room s = new SuiteRoom("Three Bed Suite Room", 3, one, two, three, four, five);
		Room[] allRoom = {r, f, s};
		Hotel h = new Hotel("Test Hotel", allRoom);
		Reserver re = new Reserver(h);
		re.init();
	}
}
