package com.chee.hotel;

/**
 * This class represents the most basic room inside
 * a hotel. There are no set items to be placed
 * inside the room. Any BasicRoom created must 
 * have a list of items that are going to be in the room.
 * 
 * @author Chee Peng
 *
 */
public class BasicRoom extends Room{

	public BasicRoom(String name, int roomNo, Item...items) {
		super(name, roomNo, items);
		this.roomBaseCost = BASIC_ROOM_COST;
	}
}
