package Display;

import HomeAccessories.*;
import HouseholdItems.*;
import Rooms.*;

import java.util.Scanner;

public class UserInterface {
    //keeps track of the room the user is in
    private String currentRoom;
    Scanner scanner;
    LivingRoom livingRoom;
    Bedroom bedroom;
    Bathroom bathroom;
    Garage garage;
    Kitchen kitchen;
    Office office;

    //constructor for the ui
    public UserInterface(LivingRoom livingRoom, Bedroom bedroom, Bathroom bathroom, Garage garage, Kitchen kitchen, Office office) {
        //Creates the user interface and the sets to user to the outside the house
        currentRoom = "Outside";
        scanner = new Scanner(System.in);
        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.garage = garage;
        this.kitchen = kitchen;
        this.office = office;
    }

    //gets the name of the current room
    public String getCurrentRoom() {
        return currentRoom;
    }

    //sets the name of the current room
    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

    //allows user to choose a room to look at
    public void chooseRoom() {
        System.out.println("Choose Room To View");
        System.out.println("Current Room: " + getCurrentRoom());
        System.out.println("(1) Living Room");
        System.out.println("(2) Bathroom");
        System.out.println("(3) Bedroom");
        System.out.println("(4) Garage");
        System.out.println("(5) Kitchen");
        System.out.println("(6) Office");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                setCurrentRoom("Living Room");
                lookAtLivingRoom();
                break;
            case 2:
                setCurrentRoom("Bathroom");
                lookAtBathroom();
                break;
            case 3:
                setCurrentRoom("Bedroom");
                lookAtBedroom();

                break;
            case 4:
                setCurrentRoom("Garage");
                lookAtGarage();

                break;
            case 5:
                setCurrentRoom("Kitchen");
                lookAtKitchen();

                break;
            case 6:
                setCurrentRoom("Office");
                lookAtOffice();

                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // If the user wants to leave the program the can use "x"
    public boolean seenEnoughOfHouse() {
        System.out.println("Ready to Leave the House?");
        System.out.println("Press Enter to continue");
        System.out.println("Press X to leave");
        scanner.nextLine();
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("x")) {
            System.out.println("Thank You For Coming");
            return false;
        } else {
            return true;
        }
    }
    public boolean seenEnoughOfRoom() {
        System.out.println("Ready to Leave the " + getCurrentRoom() + "?");
        System.out.println("Press Enter to continue");
        System.out.println("Press X to leave");
        scanner.nextLine();
        String choice = scanner.nextLine();
        return !choice.equalsIgnoreCase("x");
    }

    public void useFurnitureMenu(Room room) {
        Furniture[] furnitureInRoom = room.getFurniture();
        //looks to see if the room has furniture if not then it will print to furniture
        if (furnitureInRoom.length == 0) {
            System.out.println("No furniture in this room");
        }
        //prints the name of the furniture and number for it too
        System.out.println("Select a furniture item to interact with:");
        for (int i = 0; i < furnitureInRoom.length; i++) {
            System.out.println("(" + (i + 1) + ") " + furnitureInRoom[i].getFurnitureName());
        }
        int choice = scanner.nextInt();
        //if the users choice is less than one or more than the number of furniture in the room there will be an error
        if (choice < 1 || choice > furnitureInRoom.length) {
            System.out.println("Invalid choice. Please select a valid furniture item.");
        }

        //Perform interaction with the selected furniture
        Furniture selectedFurniture = furnitureInRoom[choice - 1];
        selectedFurniture.useFurniture();
        System.out.println(" ");
    }

    public void useAppliancesMenu(Room room) {
        Appliance[] applianceInRoom = room.getAppliances();
        //looks to see if the room has appliance if not then it will print to appliance
        if (applianceInRoom.length == 0) {
            System.out.println("No appliances in this room");
        }
        //prints the name of the appliance and number for it too
        System.out.println("Select an appliance to interact with:");
        for (int i = 0; i < applianceInRoom.length; i++) {
            System.out.println("(" + (i + 1) + ") " + applianceInRoom[i].getApplianceName());
        }
        int choice = scanner.nextInt();
        //if the users choice is less than one or more than the number of appliance in the room there will be an error
        if (choice < 1 || choice > applianceInRoom.length) {
            System.out.println("Invalid choice. Please select a valid appliance item.");
        }
        //Perform interaction with the selected appliance
        Appliance selectedAppliance = applianceInRoom[choice - 1];
        selectedAppliance.useAppliance();
        System.out.println(" ");
    }

    public void useHouseholdItemsMenu(Room room) {
        HouseholdItem[] itemsInRoom = room.getHouseItems();
        //check if the room has any household items
        if (itemsInRoom.length == 0) {
            System.out.println("No household items in this room.");
        } else {
            //display the available household items
            System.out.println("Select a household item to interact with:");
            for (int i = 0; i < itemsInRoom.length; i++) {
                System.out.println("(" + (i + 1) + ") " + itemsInRoom[i].getItemName());
            }
            //prompts the user for a choice
            int choice = scanner.nextInt();
            //validate the user's choice
            if (choice < 1 || choice > itemsInRoom.length) {
                System.out.println("Invalid choice. Please select a valid household item.");
            } else {
                //performs interaction with the selected household item
                HouseholdItem selectedItem = itemsInRoom[choice - 1];
                selectedItem.useHouseholdItem();
                System.out.println();
            }
        }
    }

    public void lookAtLivingRoom() {
        System.out.println("This is the living room");
        System.out.println(livingRoom.getRoomDesc());
        System.out.println("Furniture: ");
        System.out.println("=============");
        //displays furniture in the living room
        if (livingRoom.getFurniture().length > 0) {
            for (Furniture furniture : livingRoom.getFurniture()) {
                System.out.println(furniture.getFurnitureName() + ": " + furniture.getFurnitureDesc());
            }
            System.out.println(" ");
            useFurnitureMenu(livingRoom);
        } else {
            System.out.println("No furniture in this room");
        }
        //displays appliances in the living room
        System.out.println("Appliances:");
        System.out.println("=============");
        if (livingRoom.getAppliances().length > 0) {
            for (Appliance appliance : livingRoom.getAppliances()) {
                System.out.println(appliance.getApplianceName() + ": " + appliance.getApplianceDesc());
            }
            System.out.println(" ");

            useAppliancesMenu(livingRoom);
        } else {
            System.out.println("No appliances in this room");
        }

        //displays household items in the living room
        System.out.println("Household Items: ");
        System.out.println("=============");
        if (livingRoom.getHouseItems().length > 0) {
            for (HouseholdItem householdItem : livingRoom.getHouseItems()) {
                System.out.println(householdItem.getItemName() + ": " + householdItem.getItemDesc());
            }
            useHouseholdItemsMenu(livingRoom);
            System.out.println(" ");

        } else {
            System.out.println("No household items in this room");
        }
    }
    public void lookAtBedroom() {
        System.out.println("This is the bedroom");
        System.out.println(bedroom.getRoomDesc());
        System.out.println("Furniture: ");
        System.out.println("=============");

        // Display furniture in the bedroom
        if (bedroom.getFurniture().length > 0) {
            for (Furniture furniture : bedroom.getFurniture()) {
                System.out.println(furniture.getFurnitureName() + ": " + furniture.getFurnitureDesc());
            }
            System.out.println(" ");
            useFurnitureMenu(bedroom);
        } else {
            System.out.println("No furniture in this room");
        }

        // Display appliances in the bedroom
        System.out.println("Appliances:");
        System.out.println("=============");

        if (bedroom.getAppliances().length > 0) {
            for (Appliance appliance : bedroom.getAppliances()) {
                System.out.println(appliance.getApplianceName() + ": " + appliance.getApplianceDesc());
            }
            System.out.println(" ");
            useAppliancesMenu(bedroom);
        } else {
            System.out.println("No appliances in this room");
        }

        // Display household items in the bedroom
        System.out.println("Household Items: ");
        System.out.println("=============");

        if (bedroom.getHouseItems().length > 0) {
            for (HouseholdItem householdItem : bedroom.getHouseItems()) {
                System.out.println(householdItem.getItemName() + ": " + householdItem.getItemDesc());
            }
            System.out.println(" ");
            useHouseholdItemsMenu(bedroom);
        } else {
            System.out.println("No household items in this room");
        }
    }
    public void lookAtGarage() {
        System.out.println("This is the garage");
        System.out.println(garage.getRoomDesc());
        System.out.println("Furniture: ");
        System.out.println("=============");
        // Display furniture in the garage
        if (garage.getFurniture().length > 0) {
            for (Furniture furniture : garage.getFurniture()) {
                System.out.println(furniture.getFurnitureName() + ": " + furniture.getFurnitureDesc());
            }
            System.out.println(" ");
            useFurnitureMenu(garage);
        } else {
            System.out.println("No furniture in this room");
        }
        System.out.println("Appliances:");
        System.out.println("=============");
        // Display appliances in the garage
        if (garage.getAppliances().length > 0) {
            for (Appliance appliance : garage.getAppliances()) {
                System.out.println(appliance.getApplianceName() + ": " + appliance.getApplianceDesc());
            }
            System.out.println(" ");
            useAppliancesMenu(garage);
        } else {
            System.out.println("No appliances in this room");
        }
        System.out.println("Household Items: ");
        System.out.println("=============");
        // Display household items in the garage
        if (garage.getHouseItems().length > 0) {
            for (HouseholdItem householdItem : garage.getHouseItems()) {
                System.out.println(householdItem.getItemName() + ": " + householdItem.getItemDesc());
            }
            System.out.println(" ");
            useHouseholdItemsMenu(garage);
        } else {
            System.out.println("No household items in this room");
        }
    }
    public void lookAtKitchen() {
        System.out.println("This is the kitchen");
        System.out.println(kitchen.getRoomDesc());
        System.out.println("Furniture: ");
        System.out.println("=============");

        // Display furniture in the kitchen
        if (kitchen.getFurniture().length > 0) {
            for (Furniture furniture : kitchen.getFurniture()) {
                System.out.println(furniture.getFurnitureName() + ": " + furniture.getFurnitureDesc());
            }
            System.out.println(" ");
            useFurnitureMenu(kitchen);
        } else {
            System.out.println("No furniture in this room");
        }

        System.out.println("Appliances:");
        System.out.println("=============");

        // Display appliances in the kitchen
        if (kitchen.getAppliances().length > 0) {
            for (Appliance appliance : kitchen.getAppliances()) {
                System.out.println(appliance.getApplianceName() + ": " + appliance.getApplianceDesc());
            }
            System.out.println(" ");
            useAppliancesMenu(kitchen);
        } else {
            System.out.println("No appliances in this room");
        }

        System.out.println("Household Items: ");
        System.out.println("=============");

        // Display household items in the kitchen
        if (kitchen.getHouseItems().length > 0) {
            for (HouseholdItem householdItem : kitchen.getHouseItems()) {
                System.out.println(householdItem.getItemName() + ": " + householdItem.getItemDesc());
            }
            System.out.println(" ");
            useHouseholdItemsMenu(kitchen);
        } else {
            System.out.println("No household items in this room");
        }
    }
    public void lookAtOffice() {
        System.out.println("This is the office");
        System.out.println(office.getRoomDesc());
        System.out.println("Furniture: ");
        System.out.println("=============");

        // Display furniture in the office
        if (office.getFurniture().length > 0) {
            for (Furniture furniture : office.getFurniture()) {
                System.out.println(furniture.getFurnitureName() + ": " + furniture.getFurnitureDesc());
            }
            System.out.println(" ");
            useFurnitureMenu(office);
        } else {
            System.out.println("No furniture in this room");
        }

        System.out.println("Appliances:");
        System.out.println("=============");

        // Display appliances in the office
        if (office.getAppliances().length > 0) {
            for (Appliance appliance : office.getAppliances()) {
                System.out.println(appliance.getApplianceName() + ": " + appliance.getApplianceDesc());
            }
            System.out.println(" ");
            useAppliancesMenu(office);
        } else {
            System.out.println("No appliances in this room");
        }

        System.out.println("Household Items: ");
        System.out.println("=============");

        // Display household items in the office
        if (office.getHouseItems().length > 0) {
            for (HouseholdItem householdItem : office.getHouseItems()) {
                System.out.println(householdItem.getItemName() + ": " + householdItem.getItemDesc());
            }
            System.out.println(" ");
            useHouseholdItemsMenu(office);
        } else {
            System.out.println("No household items in this room");
        }
    }
    public void lookAtBathroom() {
        System.out.println("This is the bathroom");
        System.out.println(bathroom.getRoomDesc());
        System.out.println("Furniture: ");
        System.out.println("=============");

        // Display furniture in the bathroom if available
        Furniture[] bathroomFurniture = bathroom.getFurniture();
        if (bathroomFurniture.length > 0) {
            for (Furniture furniture : bathroomFurniture) {
                System.out.println(furniture.getFurnitureName() + ": " + furniture.getFurnitureDesc());
            }
            System.out.println(" ");
            useFurnitureMenu(bathroom);
        } else {
            System.out.println("No furniture in this room");
        }

        // Display appliances in the bathroom if available
        Appliance[] bathroomAppliances = bathroom.getAppliances();
        System.out.println("Appliances:");
        System.out.println("=============");
        if (bathroomAppliances.length > 0) {
            for (Appliance appliance : bathroomAppliances) {
                System.out.println(appliance.getApplianceName() + ": " + appliance.getApplianceDesc());
            }
            System.out.println(" ");
            useAppliancesMenu(bathroom);
        } else {
            System.out.println("No appliances in this room");
        }

        // Display household items in the bathroom if available
        HouseholdItem[] bathroomHouseholdItems = bathroom.getHouseItems();
        System.out.println("Household Items: ");
        System.out.println("=============");
        if (bathroomHouseholdItems.length > 0) {
            for (HouseholdItem householdItem : bathroomHouseholdItems) {
                System.out.println(householdItem.getItemName() + ": " + householdItem.getItemDesc());
            }
            System.out.println(" ");
            useHouseholdItemsMenu(bathroom);
        } else {
            System.out.println("No household items in this room");
        }
    }

}
