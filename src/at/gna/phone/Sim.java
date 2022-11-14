package at.gna.phone;

public class Sim
{
    private int id;
    private String number;

    //
    // Constructor
    //

    public Sim(int id, String number)
    {
        this.id = id;
        this.number = number;
    }

    //
    // Functions
    //

    public void doCall(String number)
    {
        System.out.println("Rufe '" + number + "' an!");
    }

    //
    // Getter
    //

    public int getId()
    {
        return id;
    }

    public String getNumber()
    {
        return number;
    }
}
