package at.gna.plane;

public class Tank
{
    private float maxFuel;
    private float currentFuel;
    private String manufacturer;
    private float height;
    private float width;
    private float length;
    private float weight;

    public Tank(float maxFuel, String manufacturer, float height, float width, float length, float weight)
    {
        this.maxFuel = maxFuel;
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public float getCurrentFuel()
    {
        return currentFuel;
    }
}
