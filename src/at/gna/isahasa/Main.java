package at.gna.isahasa;

public class Main
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal(100, 50);
        Animal a2 = new Animal(2, 3);
        Dog d1 = new Dog(20, 50);
        Zoo zoo = new Zoo("TestZoo", "TestStraße");

        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.addAnimal(d1);

        zoo.printAnimals();
        d1.bark();
    }
}
