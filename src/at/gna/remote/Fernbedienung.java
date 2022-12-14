package at.gna.remote;

import java.util.List;
import java.util.ArrayList;

public class Fernbedienung
{
    private int batteryAmount;
    private List<Batterie> batteries;

    public Fernbedienung(int batteryAmount)
    {
        this.batteryAmount = batteryAmount;
        this.batteries = new ArrayList<>();
    }

    public void addBatterie(Batterie batterie)
    {
        this.batteries.add(batterie);
    }

    public List<Batterie> getBatteries()
    {
        return batteries;
    }

    public void getStatus()
    {
        System.out.println((this.batteries.get(0).getChargingStatus() + this.batteries.get(1).getChargingStatus())/2);
    }

    public void turnOn()
    {
        this.batteries.get(0).setChargingStatus(this.batteries.get(0).getChargingStatus() - 5);
        this.batteries.get(1).setChargingStatus(this.batteries.get(1).getChargingStatus() - 5);
        System.out.println("Consumer connected");
    }

    public void turnOff()
    {
        System.out.println("Consumer disconnected");
    }

    //
    // Getter & Setter
    //

    public int getBatteryAmount()
    {
        return batteryAmount;
    }

    public void setBatteryAmount(int batteryAmount)
    {
        this.batteryAmount = batteryAmount;
    }
}
