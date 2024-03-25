package Rooms;

import HomeAccessories.Appliance;
import HomeAccessories.Furniture;
import HouseholdItems.HouseholdItem;

public class LivingRoom extends Room {
    public LivingRoom(String roomName, String roomDesc, int windowCount, Furniture[] furniture, Appliance[] appliances, HouseholdItem[] houseItems) {
        super(roomName, roomDesc, windowCount, furniture, appliances, houseItems);
    }

}
