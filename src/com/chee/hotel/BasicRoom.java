package com.chee.hotel;

public class BasicRoom extends Room{

	public BasicRoom(String name, int roomNo, Item...items) {
		super(name, roomNo, items);
		this.roomBaseCost = BASIC_ROOM_COST;
		this.totalCost = Room.calculateCost(this);
	}
}
