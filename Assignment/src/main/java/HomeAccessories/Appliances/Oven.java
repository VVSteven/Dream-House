package HomeAccessories.Appliances;

import HomeAccessories.Appliance;

public class Oven extends Appliance {
    public Oven(String applianceName, String applianceDesc) {
        super(applianceName, applianceDesc);
    }
    @Override
    public void useAppliance() {
        System.out.println("Make an omelette with a side of eggs");
    }
}
