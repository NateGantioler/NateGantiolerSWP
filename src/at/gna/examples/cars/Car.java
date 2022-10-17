package at.gna.examples.cars;

public class Car
{
    private String color;
    private int MaxSpeed;
    private int BasePrice;
    private Manufacturer manufacturer;
    private Engine engine;

    //
    // Constructor
    //

    public Car(String color, int maxSpeed, int basePrice, Manufacturer manufacturer, Engine engine)
    {
        this.color = color;
        MaxSpeed = maxSpeed;
        BasePrice = basePrice;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    //
    // Functions
    //

    public void driveCar(int km)
    {
        this.engine.setKmDriven(this.engine.getKmDriven()+km);
        if(this.engine.getKmDriven() >= 50000)
        {
            this.engine.setFuelConsumption(this.engine.getFuelConsumption() + this.engine.getFuelConsumption() * 0.098);
        }
    }

    //
    // Getter & Setter
    //

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getMaxSpeed()
    {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        MaxSpeed = maxSpeed;
    }

    public int getBasePrice()
    {
        return BasePrice;
    }

    public void setBasePrice(int basePrice)
    {
        BasePrice = basePrice;
    }

    public Manufacturer getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
}