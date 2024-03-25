package HomeAccessories.Furnishing;

import HomeAccessories.Furniture;

public class Table extends Furniture {
    public Table(String furnitureName, String furnitureDesc) {
        super(furnitureName, furnitureDesc);
    }

    @Override
    public void useFurniture() {
        System.out.println("You sit at the table and do something");
    }
}