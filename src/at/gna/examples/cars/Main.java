package at.gna.examples.cars;

public class Main
{
    public static void main(String[] args)
    {
        Manufacturer Opel = new Manufacturer("Opel", "Austria", 10);
        Engine V5 = new Engine(Engine.TYPE.DIESEL, 150, 5, 20000);
        Car c1 = new Car("Black", 120, 60000, Opel, V5);
        float price = c1.getBasePrice() - c1.getBasePrice()/Opel.getDiscount();
        System.out.println(price);
    }
}
