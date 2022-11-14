package at.gna.phone;

public class Main
{
    public static void main(String[] args)
    {
        Sim sim = new Sim(174, "+43 503 5012");
        Camera camera = new Camera(1000);
        SDcard sdCard = new SDcard(20000);
        Phone phone = new Phone("Black", sim, camera, sdCard);

        phone.takePicture();
        phone.takePicture();
        phone.takePicture();
        phone.takePicture();
        phone.makeCall("+43 402 7045");
        phone.getFreeSpace();
        phone.printAllFiles();
    }
}
