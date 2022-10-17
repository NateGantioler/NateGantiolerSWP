package at.gna.lamp;
import java.util.List;

public class Lamp
{
    private List<Light> lights;
    private int powerUsed;

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
        }
    }

    public void turnAllOn()
    {
        for(int i = 0; i < lights.size(); i++)
        {
            if(lights.get(i).isOn() != true)
            {
                lights.get(i).setOn(true);
                powerUsed += lights.get(i).getPowerUsage();
            }
        }
    }

    public void getOverallPowerUsage
    {

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
