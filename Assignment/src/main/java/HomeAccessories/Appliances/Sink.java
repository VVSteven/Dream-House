package HomeAccessories.Appliances;

import HomeAccessories.Appliance;

public class Sink extends Appliance {
    public Sink(String applianceName, String applianceDesc) {
        super(applianceName, applianceDesc);
    }

    @Override
    public void useAppliance() {
        System.out.println("You wash and clean something");
    }
}
