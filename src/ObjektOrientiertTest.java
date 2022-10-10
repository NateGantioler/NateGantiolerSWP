public class ObjektOrientiertTest
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 5);
        Tank t1 = new Tank(120, 30);
        Car c1 = new Car(e1, t1, "Audi", "1234", "Black");

        System.out.println(c1.getBrand());
        System.out.println(c1.getColor());
        System.out.println(c1.getSerialNumber());


        //
        // Car Funktions
        //
        c1.drive(50);
        c1.Break();
        c1.turboBoost();
        c1.honk(5);
        c1.getRemainingRange();
    }
}
