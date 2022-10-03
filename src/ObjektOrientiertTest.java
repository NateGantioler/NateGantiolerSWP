public class ObjektOrientiertTest
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelAmount = 30;
        c1.maxFuelAmount = 120;
        c1.fuelConsumption = 5;
        c1.serialNumber = "1234";

        //Drive
        c1.drive();

        //Break
        c1.Break();

        //Turbo
        c1.turboBoost();

        //Honk
        c1.honk(5);

        //Remaining Range
        c1.getRemainingRange();
    }
}
