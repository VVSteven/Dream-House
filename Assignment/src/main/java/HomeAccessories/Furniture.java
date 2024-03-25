package HomeAccessories;
//the furniture class is an abstract class meaning it can't be initialized only its subclasses
public abstract class Furniture {
    //name of the furniture
    private String furnitureName;
    //Description of the furniture
    private String furnitureDesc;
//Constructor for furniture
    public Furniture(String furnitureName, String furnitureDesc) {
        this.furnitureName = furnitureName;
        this.furnitureDesc = furnitureDesc;
    }
//getter for the name of the piece of furniture
    public String getFurnitureName() {
        return furnitureName;
    }
//getter for the description of the piece of furniture
    public String getFurnitureDesc() {
        return furnitureDesc;
    }
//Method to use the furniture will be overridden by subclasses
    public abstract void useFurniture();
}