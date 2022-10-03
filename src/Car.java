public class Car
{
    public int fuelConsumption;
    public float fuelAmount;
    public float maxFuelAmount;
    public String brand;
    public String serialNumber;
    public String color;

    public void drive()
    {
        this.fuelAmount -= this.fuelConsumption;
        System.out.println("Driving");
    }

    public void Break()
    {
        System.out.println("Ich Bremse");
    }

    public void turboBoost()
    {
        if(this.fuelAmount / this.maxFuelAmount >= 0.1)
        {
            System.out.println("SuperBoostMode");
        }
        else
        {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions)
    {
        for(int i = 0; i < amountOfRepetitions; i++)
        {
            System.out.print("Tuuut ");
        }
    }

    public void getRemainingRange()
    {
        System.out.println((this.fuelAmount/this.fuelConsumption)*100 + " km left");
    }
}
