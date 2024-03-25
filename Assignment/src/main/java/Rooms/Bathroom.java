package Rooms;

import HomeAccessories.Appliance;
import HomeAccessories.Furniture;
import HouseholdItems.HouseholdItem;

public class Bathroom extends Room {
    public Bathroom(String roomName, String roomDesc, int windowCount, Furniture[] furniture, Appliance[] appliances, HouseholdItem[] houseItems) {
        super(roomName, roomDesc, windowCount, furniture, appliances, houseItems);
    }
}
