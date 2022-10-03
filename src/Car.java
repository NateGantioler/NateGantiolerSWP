public class Car
{
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;

    public void drive()
    {
        this.fuelAmount -= this.fuelConsumption;
        System.out.println("Driving");
    }
}
