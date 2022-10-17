package at.gna.lamp;

public class Main
{
    public static void main(String[] args)
    {
        Light l1 = new Light("Light1", "Red", 3, false);
        Light l2 = new Light("Light2", "Green", 4, false);
        Light l3 = new Light("Light3", "Blue", 5, false);
        Lamp lamp1 = new Lamp();
        lamp1.addLight(l1);
        lamp1.addLight(l2);
        lamp1.addLight(l3);

        lamp1.turnOn(l1);
        lamp1.turnAllOn();
        lamp1.getOverallPowerUsage();
    }
}
