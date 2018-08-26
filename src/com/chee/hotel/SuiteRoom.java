package com.chee.hotel;

/**
 * This class represents the most expensive suite room inside
 * a hotel. There are no set items to be placed
 * inside the room. Any SuiteRoom created must 
 * have a list of items that are going to be in the room.
 * 
 * @author Chee Peng
 *
 */
public class SuiteRoom extends Room{

	public SuiteRoom(String name, int roomNo, Item...items) {
		super(name, roomNo, items);
		this.roomBaseCost = SUITE_ROOM_COST;
	}
}
