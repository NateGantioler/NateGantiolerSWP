package at.gna.remote;

public class Main
{
    public static void main(String[] args)
    {
        Fernbedienung f1 = new Fernbedienung(2);
        Batterie b1 = new Batterie(100);
        Batterie b2 = new Batterie(90);

        f1.addBatterie(b1);
        f1.addBatterie(b2);

        f1.getStatus();
        f1.turnOn();
        f1.getStatus();
        f1.turnOff();
    }
}
