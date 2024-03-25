package Rooms;

import HomeAccessories.Appliance;
import HomeAccessories.Furniture;
import HouseholdItems.HouseholdItem;

public class Office extends Room {
    public Office(String roomName, String roomDesc, int windowCount, Furniture[] furniture, Appliance[] appliances, HouseholdItem[] houseItems) {
        super(roomName, roomDesc, windowCount, furniture, appliances, houseItems);
    }
}
