public class ObjektOrientiertTest
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelAmount = 30;
        c1.fuelConsumption = 5;
        c1.serialNumber = "1234";

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelAmount = 25;
        c2.fuelConsumption = 4;
        c2.serialNumber = "5678";

        //Fahren
        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
    }
}
