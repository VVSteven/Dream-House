package HomeAccessories.Appliances;

import HomeAccessories.Appliance;
public class Shower extends Appliance {
    public Shower(String applianceName, String applianceDesc) {
        super(applianceName, applianceDesc);
    }

    @Override
    public void useAppliance() {
        System.out.println("Take a shower");
    }
}
