package HomeAccessories.Furnishing;

import HomeAccessories.Furniture;

public class Bed extends Furniture {
    public Bed(String furnitureName, String furnitureDesc) {
        super(furnitureName, furnitureDesc);
    }

    @Override
    public void useFurniture() {
        System.out.println("You lay down and take a 10 hour nap");
    }

}
