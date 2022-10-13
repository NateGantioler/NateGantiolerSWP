package at.gna.car;

import java.util.List;
import java.util.ArrayList;

public class Car
{
    private String brand;
    private String serialNumber;
    private String color;
    private Engine engine;
    private Tank tank;
    private List<RearMirror> mirrors;
    private List<Tire> tires;

    //
    // Car.Car Funktions
    //

    public Car(Engine engine, Tank tank, String b, String sn, String color)
    {
        this.engine = engine;
        this.tank = tank;
        this.brand = b;
        this.serialNumber = sn;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror)
    {
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors()
    {
        return mirrors;
    }

    public void addTire(Tire tire)
    {
        this.tires.add(tire);
    }

    public List<Tire> getTires()
    {
        return tires;
    }

    public void drive(int speed)
    {
        this.tank.setFuel(this.tank.getFuel() - (this.engine.getFuelConsumption()/100)*speed);
        System.out.println("Driving");
        System.out.println(this.tank.getFuel());
    }

    public void Break()
    {
        System.out.println("Ich Bremse");
    }

    public void turboBoost()
    {
        if(this.tank.getFuel() / this.tank.getMaxFuel() >= 0.1)
        {
            System.out.println("SuperBoostMode");
        }
        else
        {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions)
    {
        for(int i = 0; i < amountOfRepetitions; i++)
        {
            System.out.print("Tuuut ");
        }
    }

    public void getRemainingRange()
    {
        System.out.println();
        System.out.println((this.tank.getFuel()/this.engine.getFuelConsumption())*100 + " km left at full throttle");
    }



    //
    //Setters
    //

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void setTank(Tank tank)
    {
        this.tank = tank;
    }

    //
    // Getter
    //

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public Tank getTank()
    {
        return tank;
    }
}
