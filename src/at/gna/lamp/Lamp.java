package at.gna.lamp;
import java.util.ArrayList;
import java.util.List;

public class Lamp
{
    private List<Light> lights;
    private int powerUsed;

    public Lamp()
    {
        this.lights = new ArrayList<>();
    }

    public void addLight(Light light)
    {
        this.lights.add(light);
    }

    public void turnOn(Light light)
    {
        if(light.isOn() == true)
        {
            System.out.println("Mein Name ist " + light.getName() + ". Ich bin bereits eingeschaltet");
        }
        else
        {
            light.setOn(true);
            powerUsed += light.getPowerUsage();
            System.out.println(light.getName() + " eingeschaltet");
        }
    }

    public void turnAllOn()
    {
        for(int i = 0; i < this.lights.size(); i++)
        {
            turnOn(this.lights.get(i));
        }
    }

    public double getOverallPowerUsage()
    {
        return this.powerUsed;
    }

    public void printNamesOfLightElements()
    {
        for(int i = 0; i < this.lights.size(); i++)
        {
            System.out.println(this.lights.get(i).getName());
        }
    }
    //
    // Getter & Setter
    //

    public List<Light> getLights()
    {
        return lights;
    }

    public void setLights(List<Light> lights)
    {
        this.lights = lights;
    }

    public int getPowerUsed()
    {
        return powerUsed;
    }

    public void setPowerUsed(int powerUsed)
    {
        this.powerUsed = powerUsed;
    }
}
