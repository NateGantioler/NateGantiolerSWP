package at.gna.plane;

import java.util.ArrayList;
import java.util.List;

public class Hangar
{
    private float space;
    private float height;
    private float width;
    private float length;
    private int doors;
    private int lights;
    private String color;

    private List<Airplane> airplaneList = new ArrayList<>();

    public Hangar(float space, float height, float width, float length, int doors, int lights, String color)
    {
        this.space = space;
        this.height = height;
        this.width = width;
        this.length = length;
        this.doors = doors;
        this.lights = lights;
        this.color = color;
    }

    public void AddAirplane(Airplane plane)
    {
        airplaneList.add(plane);
        System.out.println("Added Plane: " + plane);
    }

    public void RemoveAirplane(Airplane plane)
    {
        airplaneList.remove(plane);
        System.out.println("Removed Plane: " + plane);
    }
}
