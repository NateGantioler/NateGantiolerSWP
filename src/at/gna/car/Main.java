package at.gna.car;

public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 5);
        Tank t1 = new Tank(120, 30);
        Car c1 = new Car(e1, t1, "Audi", "1234", "Black");
        RearMirror r1 = new RearMirror(100, -10);
        RearMirror r2 = new RearMirror(100, 10);
        c1.addMirror(r1);
        c1.addMirror(r2);

        Tire ti1 = new Tire(50, "Silver");
        Tire ti2 = new Tire(50, "Silver");
        Tire ti3 = new Tire(50, "Rusty");
        Tire ti4= new Tire(50, "Rusty");
        c1.addTire(ti1);
        c1.addTire(ti2);
        c1.addTire(ti3);
        c1.addTire(ti4);

        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getTires().get(2).getRimColor());

        //
        // Car.Car Funktions
        //

        /*System.out.println(c1.getBrand());
        System.out.println(c1.getColor());
        System.out.println(c1.getSerialNumber());
        c1.drive(50);
        c1.Break();
        c1.turboBoost();
        c1.honk(5);
        c1.getRemainingRange();*/
    }
}
