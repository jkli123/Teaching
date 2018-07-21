package com.chee.hotel;

public class Item {

	private String name;
	private int cost;
	
	
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
