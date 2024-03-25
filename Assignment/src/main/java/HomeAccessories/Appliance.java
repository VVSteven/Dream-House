package HomeAccessories;
public abstract class Appliance {
    //name of the furniture
    private String applianceName;
    //Description of the furniture
    private String applianceDesc;
    //Constructor for appliance
    public Appliance(String applianceName, String applianceDesc) {
        this.applianceName = applianceName;
        this.applianceDesc = applianceDesc;
    }
    //getter for the name of the appliance
    public String getApplianceName() {
        return applianceName;
    }
    //getter for the description of the appliance
    public String getApplianceDesc() {
        return applianceDesc;
    }
    public abstract void useAppliance();
}