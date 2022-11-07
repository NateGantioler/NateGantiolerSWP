package at.gna.car;

public class Truck extends Car{
    private String trailer;

    //Construktor
    public Truck(Engine engine, Tank tank, String b, String sn, String color, String trailer)
    {
        super(engine, tank, b, sn, color);
        this.trailer = trailer;
    }

    //Getter & Setter
    public String getTrailer()
    {
        return trailer;
    }

    public void setTrailer(String trailer)
    {
        this.trailer = trailer;
    }

    @Override
    public void drive(int speed)
    {
        System.out.println("Fahre truck");
    }
}
