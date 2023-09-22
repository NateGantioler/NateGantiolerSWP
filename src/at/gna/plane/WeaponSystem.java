package at.gna.plane;

public class WeaponSystem
{
    private String caliber;
    private int RPM;
    private String manufacturer;
    private float height;
    private float width;
    private float length;
    private float weight;

    public WeaponSystem(String caliber, int RPM, String manufacturer, float height, float width, float length, float weight)
    {
        this.caliber = caliber;
        this.RPM = RPM;
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }
}
