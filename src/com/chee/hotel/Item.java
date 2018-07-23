package com.chee.hotel;

/**
 * This class represents an item that can found in a hotel room
 * Any item can be made given the name and the cost of it.
 * All items made are immutable and cannot be changed once instantiated.
 * 
 * @author Chee Peng
 *
 */
public class Item {

	//The final keyword is to make the field immutable
	private final String name;
	private final int cost;
	
	public Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Item)) {
			throw new IllegalArgumentException("Argument provided is not an item");
		} else {
			Item item = (Item)o;
			return this.name.equals(item.name) && this.cost == item.cost;
		}
	}
	
	public String toString() {
		return "[Item Name: " + name + ", item cost: " + cost + "]";
	}
}
