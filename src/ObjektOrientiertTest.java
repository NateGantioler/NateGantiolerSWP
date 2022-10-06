public class ObjektOrientiertTest
{
    public static void main(String[] args)
    {
        Car c1 = new Car(5, 30, 120, "Audi", "1234", "Black");

        System.out.println(c1.getBrand());
        System.out.println(c1.getColor());
        System.out.println(c1.getSerialNumber());
        System.out.println(c1.getFuelAmount());
        System.out.println(c1.getMaxFuelAmount());
        System.out.println(c1.getFuelConsumption());


        //
        // Car Funktions
        //
        c1.drive();
        c1.Break();
        c1.turboBoost();
        c1.honk(5);
        c1.getRemainingRange();
    }
}
