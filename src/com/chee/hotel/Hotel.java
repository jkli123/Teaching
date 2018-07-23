package com.chee.hotel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class represents a hotel which is part of a 
 * reservation system. The hotel contains all the rooms
 * that is present in the hotel and provides details on the
 * number of reserved rooms in the hotel.
 * 
 * @author Chee Peng
 *
 */
public class Hotel {

	protected String name;
	protected ArrayList<Room> allRooms = new ArrayList<>();
	protected int noOfReservedRooms;
	
	public Hotel(String name, Room...rooms) {
		this.name = name;
		allRooms = new ArrayList<>();
		allRooms.addAll(Arrays.asList(rooms));
	}
	
	public boolean isHotelFull() {
		return allRooms.size() == noOfReservedRooms;
	}
	
	public int getNoOfReservedRooms() {
		return noOfReservedRooms;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Room> getAllRooms() {
		return allRooms;
	}
	
	public boolean bookRoom(Room r) {
		for(Room room : allRooms) {
			if(room.equals(r)) {
				r.isReserved = true;
				noOfReservedRooms++;
				return true;
			}
		}
		throw new IllegalArgumentException("Room provided does not exist in hotel");
	}
	
	public boolean bookRoom(int roomNo) {
		if(roomNo > allRooms.size()) {
			return false;
		}
		allRooms.get(roomNo - 1).isReserved = true;
		noOfReservedRooms++;
		return true;
	}
	
	public void vacateRoom(Room r) {
		r.isReserved = false;
		noOfReservedRooms--;
	}
	
	public void vacateRoom(int roomNo) {
		allRooms.get(roomNo - 1).isReserved = false;
		noOfReservedRooms--;
	}
	
	public String toString() {
		String result = "Hotel name: " + name + "\nRooms in Hotel:\n";
		for(Room r : allRooms) {
			result += r;
		}
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
		Hotel h = new Hotel("Test Hotel", allRoom);
		System.out.println(h);
		System.out.println("Is hotel full? " + h.isHotelFull());
		h.bookRoom(f);
		h.bookRoom(s);
		System.out.println(h);
		System.out.println("Is hotel full? " + h.isHotelFull());
		System.out.println("Number of reserved rooms? " + h.getNoOfReservedRooms());
		h.bookRoom(r);
		System.out.println(h);
		System.out.println("Is hotel full? " + h.isHotelFull());
		System.out.println("Number of resrved rooms? " + h.getNoOfReservedRooms());
		h.vacateRoom(r);
		System.out.println(h);
		System.out.println("Is hotel full? " + h.isHotelFull());
		System.out.println("Number of resrved rooms? " + h.getNoOfReservedRooms());
		h.vacateRoom(f);
		h.vacateRoom(s);
		System.out.println(h);
		System.out.println("Is hotel full? " + h.isHotelFull());
		System.out.println("Number of resrved rooms? " + h.getNoOfReservedRooms());
	}
}
