package at.gna.car;

public class Tank {
    private float maxFuel;
    private float fuel;

    public Tank(float maxFuel, float fuel)
    {
        this.maxFuel = maxFuel;
        this.fuel = fuel;
    }

    //
    // Getter
    //

    public float getMaxFuel()
    {
        return maxFuel;
    }

    public float getFuel()
    {
        return fuel;
    }

    //
    // Setter
    //

    public void setFuel(float fuel)
    {
        this.fuel = fuel;
    }
}
