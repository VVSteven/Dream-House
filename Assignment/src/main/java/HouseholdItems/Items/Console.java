package HouseholdItems.Items;

import HouseholdItems.HouseholdItem;

public class Console extends HouseholdItem {
    public Console(String itemName, String itemDesc) {
        super(itemName, itemDesc);
    }

    @Override
    public void useHouseholdItem() {
        System.out.println("You play games");
    }
}
