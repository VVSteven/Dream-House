package HomeAccessories.Appliances;

import HomeAccessories.Appliance;

public class Refrigerator extends Appliance {
    public Refrigerator(String applianceName, String applianceDesc) {
        super(applianceName, applianceDesc);
    }
    @Override
    public void useAppliance() {
        System.out.println("Open it to find just eggs");
    }

}
