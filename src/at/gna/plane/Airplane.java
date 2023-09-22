package at.gna.plane;

public class Airplane
{
    protected String color;
    protected float height;
    protected float width;
    protected float length;
    protected float weight;
    protected int seats;
    protected int windows;
    protected float maxSpeed;
    private float currentSpeed;

    public Airplane(String color, float height, float width, float length, float weight, int seats, int windows, float maxSpeed)
    {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.seats = seats;
        this.windows = windows;
        this.maxSpeed = maxSpeed;
    }

    public void Accelerate(float strength)
    {
        currentSpeed += strength;
        if(currentSpeed >= maxSpeed)
        {
            currentSpeed = maxSpeed;
            System.out.println("Reached max speed");
        }
        System.out.println("Current Speed = " + currentSpeed + "km/h");
    }

    public void Decelerate(float strength)
    {
        currentSpeed -= strength;
        if(currentSpeed <= 0)
        {
            currentSpeed = 0;
            System.out.println("Plane is not moving");
        }
        System.out.println("Current Speed = " + currentSpeed + " km/h");
    }

    public void Land()
    {
        System.out.println("Landed!");
    }

    public void Takeoff()
    {
        System.out.println("Took off");
    }
}

