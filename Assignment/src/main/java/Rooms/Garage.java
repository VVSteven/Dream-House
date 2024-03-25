package Rooms;

import HomeAccessories.Appliance;
import HomeAccessories.Furniture;
import HouseholdItems.HouseholdItem;

public class Garage extends Room {
    public Garage(String roomName, String roomDesc, int windowCount, Furniture[] furniture, Appliance[] appliances, HouseholdItem[] houseItems) {
        super(roomName, roomDesc, windowCount, furniture, appliances, houseItems);
    }
}
