package at.gna.examples.cars;

public class Manufacturer
{
    private String name;
    private String country;
    private int discount; // in %

    //
    // Constructor
    //


    public Manufacturer(String name, String country, int discount)
    {
        this.name = name;
        this.country = country;
        this.discount = discount;
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

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
}
