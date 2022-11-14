package at.gna.isahasa;

public class Animal {
    private int weight;
    private int height;

    //
    // Konstruktor
    //

    public Animal(int weight, int height)
    {
        this.weight = weight;
        this.height = height;
    }

    //
    // Getter & Setter
    //

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
