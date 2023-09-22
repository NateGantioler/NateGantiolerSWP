package at.gna.plane;

import java.util.List;

public class Fighterplane extends Airplane
{
    private String military;


    private List<WeaponSystem> weaponSystemList;

    public Fighterplane(String color, float height, float width, float length, float weight, int seats, int windows, String military, float maxSpeed)
    {
        super(color, height, width, length, weight, seats, windows, maxSpeed);
        this.military = military;
    }

    public void FireWeapons()
    {
        System.out.println("Fired Weapons");
    }

    public void ReloadWeapons()
    {
        System.out.println("Reloaded all Weapons");
    }

    public void AttachWeapon(WeaponSystem weaponSystem)
    {
        weaponSystemList.add(weaponSystem);
        System.out.println("Added Weaponsystem: " + weaponSystem);
    }

    public void DetachWeapon(WeaponSystem weaponSystem)
    {
        weaponSystemList.add(weaponSystem);
        System.out.println("Added Weaponsystem: " + weaponSystem);
    }
}
