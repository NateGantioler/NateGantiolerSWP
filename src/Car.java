public class Car
{
    private int fuelConsumption;
    private float fuelAmount;
    private float maxFuelAmount;
    private String brand;
    private String serialNumber;
    private String color;

    //
    // Car Funktions
    //

    public Car(int fc, float fa, float mfa, String b, String sn, String color)
    {
        this.fuelConsumption = fc;
        this.fuelAmount =fa;
        this.maxFuelAmount = mfa;
        this.brand = b;
        this.serialNumber = sn;
        this.color = color;
    }

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
        System.out.println();
        System.out.println((this.fuelAmount/this.fuelConsumption)*100 + " km left");
    }



    //
    //Setters
    //

    public void setMaxFuelAmount(float maxFuelAmount) {
        this.maxFuelAmount = maxFuelAmount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(float fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //
    // Getter
    //


    public float getFuelAmount() {
        return fuelAmount;
    }

    public float getMaxFuelAmount() {
        return maxFuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
