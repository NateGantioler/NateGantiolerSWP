package at.gna.car;

public class Tire {
    private int size;
    private String rimColor;

    public Tire(int size, String rimColor)
    {
        this.size = size;
        this.rimColor = rimColor;
    }

    //
    // Getter & Setter
    //

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getRimColor()
    {
        return rimColor;
    }

    public void setRimColor(String rimColor)
    {
        this.rimColor = rimColor;
    }
}
