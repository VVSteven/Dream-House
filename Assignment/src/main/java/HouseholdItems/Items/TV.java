package HouseholdItems.Items;

import HouseholdItems.HouseholdItem;

public class TV extends HouseholdItem {
    public TV(String itemName, String itemDesc) {
        super(itemName, itemDesc);
    }
    @Override
    public void useHouseholdItem() {
        System.out.println("watch spongebob");
    }
}
