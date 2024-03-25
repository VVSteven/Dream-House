package HomeAccessories.Appliances;

import HomeAccessories.Appliance;

public class AirFryer extends Appliance {
    public AirFryer(String applianceName, String applianceDesc) {
        super(applianceName, applianceDesc);
    }
    @Override
    public void useAppliance() {
        System.out.println("Use it cook white bread");
    }

}
