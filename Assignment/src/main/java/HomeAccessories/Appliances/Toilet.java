package HomeAccessories.Appliances;

import HomeAccessories.Appliance;

public class Toilet extends Appliance {
    public Toilet(String applianceName, String applianceDesc) {
        super(applianceName, applianceDesc);
    }
    public void useAppliance(){
        System.out.println("You do your business and flush");
        System.out.println("You head over to the sink");
    }
}
