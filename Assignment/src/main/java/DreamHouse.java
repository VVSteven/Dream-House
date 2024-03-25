//Sim of my dream house in code form.
//The house will have rooms and items I would want in them.
//it will also have doors to leave and enter.

import Display.*;
import HomeAccessories.Appliance;
import HomeAccessories.Appliances.*;
import HomeAccessories.Furnishing.*;
import HomeAccessories.Furniture;
import HouseholdItems.HouseholdItem;
import HouseholdItems.Items.*;
import Rooms.*;

//DreamHouse Class
public class DreamHouse {
    //Main Method
    public static void main(String[] args) {
        //creates rooms
        LivingRoom livingRoom = createLivingRoom();
        Bathroom bathroom = createBathroom();
        Bedroom bedroom = createBedroom();
        Kitchen kitchen = createKitchen();
        Garage garage = createGarage();
        Office office = createOffice();

        //New instance of the display and user interface
        Display display = new Display();
        UserInterface ui = new UserInterface(livingRoom,bedroom,bathroom,garage,kitchen,office);
        display.Title();
        while (ui.seenEnoughOfHouse()) {
                ui.chooseRoom();
        }
    }

    //method to create a living room
    public static LivingRoom createLivingRoom() {
        //Home accessories
        Chair chair = new Chair("Massage Chair", "A recliner chair is a comfortable and adjustable seating .");
        Sofa sofa = new Sofa("Ashley Dorsten Slate Chaise Sofa", "Sofa that blends comfort and versatility to create the perfect lounging space.");
        //creates an array of the living room furniture
        Furniture[] livingRoomFurniture = {chair, sofa};
        //creates an array of the living room appliances it is empty
        Appliance[] livingRoomAppliance = {};
        //Household items
        TV tv = new TV("LG - 77 Class B3 Series OLED 4K", "The unmatched beauty of self-lit OLED pixels in the LG OLED B3 is more than meets the eye.");
        Console PS5 = new Console("PS5", "The latest Sony PlayStation introduced in November 2020. Powered by an eight-core AMD Zen 2 CPU and custom AMD Radeon GPU, the PS5 is offered in two models: with and without a 4K Blu-ray drive.");
        PC livingRoomPC = new PC("PC", "A small, multi-purpose digital device for individual use.");
        //creates an array of the living room household items
        HouseholdItem[] livingRoomHouseholdItems = {tv, PS5, livingRoomPC};
        //instance of a living room with furniture and household items
        return new LivingRoom("Living Room", "A place where I can lay down and play games.", 2, livingRoomFurniture, livingRoomAppliance, livingRoomHouseholdItems);
    }

    //Method to create a bathroom
    public static Bathroom createBathroom() {
        //bathroomFurniture
        Furniture[] bathroomFurniture = {};
        //Bathroom appliances
        Shower shower = new Shower("Shower", "A place to take baths.");
        Sink sink = new Sink("Sink", "A place to wash hands and brush teeth.");
        Toilet toilet = new Toilet("Toilet", "A toilet");
        Appliance[] bathroomAppliances = {shower, sink, toilet};
        TV bathroomTV = new TV("Small TV", "A small TV for entertainment in the bathroom.");
        HouseholdItem[] bathroomHouseholdItems = {bathroomTV};
        return new Bathroom("Bathroom", "Basic bathroom", 1, bathroomFurniture, bathroomAppliances, bathroomHouseholdItems);
    }
    //Method to create a kitchen
    public static Kitchen createKitchen() {
        //kitchen furniture
        Chair kitchenChair = new Chair("Kitchen Chair", "A comfortable chair for sitting at the kitchen table.");
        Table kitchenTable = new Table("Kitchen Table", "A sturdy table for dining and food preparation.");
        // Create an array of kitchen furniture
        Furniture[] kitchenFurniture = {kitchenChair, kitchenTable};
        //kitchen appliances
        Oven oven = new Oven("Stove", "A cooking appliance used for heating or cooking food.");
        Refrigerator refrigerator = new Refrigerator("Refrigerator", "An appliance used for storing food and keeping it cool.");
        Sink kitchenSink = new Sink("Kitchen Sink", "A basin with a faucet for washing dishes and food items.");
        AirFryer airFryer = new AirFryer("Air Fryer", "An appliance used for frying food with little to no oil.");
        //an array of kitchen appliances
        Appliance[] kitchenAppliances = {oven, refrigerator, kitchenSink, airFryer};
        //array of kitchen household items
        HouseholdItem[] kitchenHouseholdItems = {};

        // Create and return a new Kitchen object with the defined attributes
        return new Kitchen("Kitchen", "A place for food preparation and cooking.", 1, kitchenFurniture, kitchenAppliances, kitchenHouseholdItems);
    }

    public static Bedroom createBedroom() {
        // bedroom furniture
        Bed bed = new Bed("Bed", "A comfortable place for sleeping.");
        Table nightstand = new Table("Nightstand", "To store the stuff I want close to me");
        // Create an array of bedroom furniture
        Furniture[] bedroomFurniture = {bed,nightstand};
        Appliance[] bedroomAppliances = {};
        HouseholdItem[] bedroomHouseholdItems = {};
        return new Bedroom("Bedroom","The place I sleep",1,bedroomFurniture,bedroomAppliances,bedroomHouseholdItems);
    }

    public static Garage createGarage() {
        Furniture[] garageFurniture = {};
        Refrigerator garageRefrigerator = new Refrigerator("Refrigerator", "An appliance used for storing food and keeping it cool.");
        Appliance[] garageAppliances = {garageRefrigerator};
        HouseholdItem[] garageHouseholdItems = {};
        return new Garage("Garage", "A the room with my cars", 0, garageFurniture,garageAppliances,garageHouseholdItems);
    }

    public static Office createOffice() {
        Table desk = new Table("Desk","What I work on");
        Furniture[] officeFurniture = {desk};
        Appliance[] officeAppliance = {};
        PC workPC = new PC("Work PC", "The pc I use for work");
        HouseholdItem[] officeHouseholdItem = {workPC};
        return new Office("Office", "The place I work", 2,officeFurniture,officeAppliance,officeHouseholdItem);
    }
}
