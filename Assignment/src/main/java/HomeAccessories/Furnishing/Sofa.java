package HomeAccessories.Furnishing;

import HomeAccessories.Furniture;

public class Sofa extends Furniture {
    public Sofa(String furnitureName, String furnitureDesc) {
        super(furnitureName, furnitureDesc);
    }
    public void useFurniture(){
        System.out.println("You sit down and watch tv");
        System.out.println("After 5 hours you get up");
    }
}
