package com.chee.hotel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class represents a room in the hotel
 * A room cost is calculated based on its 
 * base cost of the room(Type of room) and the
 * items which are present in the room. This is
 * to allow the cost of a room to be determined
 * based on any additional add-ons provided by
 * customers.
 * 
 * Additionally, all rooms contain a room number
 * which is to be called upon for any changes 
 * that are to be made to the room regarding
 * its vacancy.
 * 
 * @author Chee Peng
 *
 */
public class Room {
	
	public static final int BASIC_ROOM_COST = 100;
	public static final int FAMILY_ROOM_COST = 400;
	public static final int SUITE_ROOM_COST = 1000;
	
	protected String name;
	protected ArrayList<Item> roomItems;
	protected int totalCost;
	protected int roomBaseCost;
	protected boolean isReserved;
	protected int roomNo;
	
	public Room(String name, int roomNo, Item... items) {
		this.name = name;
		roomItems = new ArrayList<>();
		roomItems.addAll(Arrays.asList(items));
		isReserved = false;
		this.roomNo = roomNo;
		totalCost = calculateCost();
	}
	
	public int calculateCost() {
		int total = 0;
		for(Item i : roomItems) {
			total += i.getCost();
		}
		return total + roomBaseCost;
	}
	
	public boolean getIsReserved() {
		return isReserved;
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Room)) {
			throw new IllegalArgumentException("Argument provided is not a room");
		} else {
			Room r = (Room)o;
			return this.name.equals(r.name) && this.roomItems.equals(r.roomItems);
		}
	}
	
	public String toString() {
		String result = "Room name: " + name + "\nRoom Number: " + roomNo + "\nRoom Items: ";
		for(Item i : roomItems) {
			result += i;
		}
		result += "\nRoom cost: " + totalCost + "\n";
		result += "Room reserve status: " + isReserved + "\n";
		return result;
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
		System.out.println(Arrays.toString(allRoom));
	}
	
}
