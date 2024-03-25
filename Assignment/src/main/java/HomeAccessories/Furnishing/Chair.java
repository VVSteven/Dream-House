package HomeAccessories.Furnishing;

import HomeAccessories.Furniture;

public class Chair extends Furniture {
    public Chair(String furnitureName, String furnitureDesc) {
        super(furnitureName, furnitureDesc);
    }

    @Override
    public void useFurniture() {
        System.out.println("You sit down and twiddle your thumbs");
    }
}
