package HouseholdItems.Items;

import HouseholdItems.HouseholdItem;

public class PC extends HouseholdItem {
    public PC(String itemName, String itemDesc) {
        super(itemName, itemDesc);
    }

    @Override
    public void useHouseholdItem() {
        System.out.println("You start playing video games");
    }
}
