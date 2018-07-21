package com.chee.hotel;

public class SuiteRoom extends Room{

	public SuiteRoom(String name, int roomNo, Item...items) {
		super(name, roomNo, items);
		this.roomBaseCost = SUITE_ROOM_COST;
		this.totalCost = Room.calculateCost(this);
	}
}
