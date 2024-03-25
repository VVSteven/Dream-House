package Rooms;

import HomeAccessories.Appliance;
import HomeAccessories.Furniture;
import HouseholdItems.HouseholdItem;

public class Room {
    //Name of room
    private String roomName;
    //Description of room
    private String roomDesc;
    //Number of windows in that room;
    private int windowCount;
    //an array of furniture in the room;
    private Furniture[] furniture;
    //an array of appliances in the room;
    private Appliance[] appliances;
    //an array of household items in the room;
    private HouseholdItem[] houseItems;

    //Rooms.Room Constructor
    public Room(String roomName, String roomDesc, int windowCount, Furniture[] furniture, Appliance[] appliances, HouseholdItem[] houseItems) {
        this.roomName = roomName;
        this.roomDesc = roomDesc;
        this.windowCount = windowCount;
        this.furniture = furniture;
        this.appliances = appliances;
        this.houseItems = houseItems;
    }

    //getter for room name
    public String getRoomName() {
        return roomName;
    }

    //getter for room description
    public String getRoomDesc() {
        return roomDesc;
    }

    //getter for number of windows
    public int getWindowCount() {
        return windowCount;
    }

    //getter for furniture
    public Furniture[] getFurniture() {
        return furniture;
    }
    //getter for appliances
    public Appliance[] getAppliances() {
        return appliances;
    }

    //getter for household items
    public HouseholdItem[] getHouseItems() {
        return houseItems;
    }
}
