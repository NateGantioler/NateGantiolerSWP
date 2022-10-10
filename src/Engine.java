public class Engine {
    public enum TYPE
    {
        DIESEL,
        GAS
    }
    private int horsepower;
    private TYPE type;
    private float fuelConsumption;


    public Engine(int horsepower, TYPE type, float fc)
    {
        this.horsepower = horsepower;
        this.type = type;
        this.fuelConsumption = fc;
    }


    //amount should be between 0 and 100
    public void drive(int amount)
    {
        System.out.println("the motor is running with: " + amount);
    }


    //
    // Getter
    //

    public int getHorsepower()
    {
        return horsepower;
    }

    public TYPE getType()
    {
        return type;
    }

    public float getFuelConsumption()
    {
        return fuelConsumption;
    }
}
