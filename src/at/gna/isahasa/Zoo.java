package at.gna.isahasa;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String street;
    private List<Animal> animals;

    //
    // Konstruktor
    //

    public Zoo(String name, String street)
    {
        this.name = name;
        this.street = street;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public void printAnimals()
    {
        for(int i = 0; i < animals.size(); i++)
        {
            System.out.println("Animal " + i + ": \n Weight: " + this.animals.get(i).getWeight() + "\n Height: " + animals.get(i).getHeight());
        }
    }

    public void makeShow()
    {
        System.out.println("The show just has started!");
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

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }
}
