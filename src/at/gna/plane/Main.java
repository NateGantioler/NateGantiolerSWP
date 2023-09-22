package at.gna.plane;

public class Main
{
    public static void main(String[] args)
    {
        Hangar hangar = new Hangar(1000, 12, 50, 100, 2, 20, "Green");

        Engine engine = new Engine("Super Diesel", "Best Engine", "Mercedes", 10, 10, 10, 100);
        Tank tank = new Tank(150, "Cisco", 10, 10, 10, 10);
        WeaponSystem miniGun = new WeaponSystem("7.62", 1200, "Seiger", 10, 10, 10 ,10);
        Fighterplane fighterPlane = new Fighterplane("Black", 2.5f, 15, 8, 400, 2, 3, "USA", 600, tank, engine);

        hangar.AddAirplane(fighterPlane);
        engine.StartEngine();
        fighterPlane.Accelerate(300);
        fighterPlane.FireWeapons();

    }
}
