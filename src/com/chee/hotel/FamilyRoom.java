package com.chee.hotel;

/**
 * This class represents a FamilyRoom inside
 * a hotel. There are no set items to be placed
 * inside the room. Any FamilyRoom created must 
 * have a list of items that are going to be in the room.
 * 
 * @author Chee Peng
 *
 */
public class FamilyRoom extends Room{

	public FamilyRoom(String name, int roomNo, Item...items) {
		super(name, roomNo, items);
		this.roomBaseCost = FAMILY_ROOM_COST;
	}
}
