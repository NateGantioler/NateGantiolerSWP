package at.gna.lamp;

import java.util.List;

public class Light
{
    private String name;
    private String color;
    private int powerUsage;
    private boolean isOn;

    //
    // Constructor
    //

    public Light(String name, String color, int powerUsage, boolean isOn)
    {
        this.name = name;
        this.color = color;
        this.powerUsage = powerUsage;
        this.isOn = isOn;
    }

    //
    // Getter & Setter
    //


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPowerUsage()
    {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage)
    {
        this.powerUsage = powerUsage;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }
}
