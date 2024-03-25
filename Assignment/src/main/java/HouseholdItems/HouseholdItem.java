package HouseholdItems;

public abstract class HouseholdItem {
    //name of item
    private String itemName;
    //Description of item
    private String itemDesc;
    //Constructor of item
    public HouseholdItem(String itemName, String itemDesc) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    //getter of the name of the item
    public String getItemName() {
        return itemName;
    }
    //getter of the description of the item
    public String getItemDesc() {
        return itemDesc;
    }
    public abstract void useHouseholdItem();
}
