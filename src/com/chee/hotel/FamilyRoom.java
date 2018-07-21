package com.chee.hotel;

public class FamilyRoom extends Room{

	public FamilyRoom(String name, int roomNo, Item...items) {
		super(name, roomNo, items);
		this.roomBaseCost = FAMILY_ROOM_COST;
		this.totalCost = Room.calculateCost(this);
	}
}
