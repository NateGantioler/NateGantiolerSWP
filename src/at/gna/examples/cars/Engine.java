package at.gna.examples.cars;

public class Engine
{
    private String fuelType;
    private int performance;
    private double fuelConsumption;
    private int kmDriven;

    //
    // Constructor
    //

    public Engine(String fuelType, int performance, double fuelConsumption, int kmDriven)
    {
        this.fuelType = fuelType;
        this.performance = performance;
        this.fuelConsumption = fuelConsumption;
        this.kmDriven = kmDriven;
    }

    //
    // Getter & Setter
    //


    public String getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public int getPerformance()
    {
        return performance;
    }

    public void setPerformance(int performance)
    {
        this.performance = performance;
    }

    public double getFuelConsumption()
    {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
    }

    public int getKmDriven()
    {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven)
    {
        this.kmDriven = kmDriven;
    }
}
