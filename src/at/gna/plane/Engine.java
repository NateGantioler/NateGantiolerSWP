package at.gna.plane;

public class Engine
{
    private String fuelType;
    private String serialNumber;
    private String manufacturer;
    private float height;
    private float width;
    private float length;
    private float weight;
    private boolean engineStatus = false;

    public Engine(String fuelType, String serialNumber, String manufacturer, float height, float width, float length, float weight)
    {
        this.fuelType = fuelType;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public void StartEngine()
    {
        engineStatus = true;
        System.out.println("Started Engine");
    }

    public void StopEngine()
    {
        engineStatus = false;
        System.out.println("Stopped Engine");
    }

}
