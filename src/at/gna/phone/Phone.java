package at.gna.phone;
import java.util.Scanner;

public class Phone
{
    private String color;
    private Sim sim;
    private Camera camera;
    private SDcard sdCard;

    //
    // Constructor
    //

    public Phone(String color, Sim sim, Camera camera, SDcard sdCard)
    {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }


    //
    // Functions
    //

    public void Login()
    {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.println("Username: ");
        username = scanner.nextLine();
        System.out.println("Passwort: ");
        password = scanner.nextLine();

        System.out.println("Willkommen " + username + "!");
    }

    public void takePicture()
    {
        if(sdCard.getFreeSpace() > 0)
        {
            sdCard.saveFile(camera.makePicture());
            System.out.println("Foto gemacht");
        }
        else
        {
            System.out.println("Kein Speicherplatz mehr");
        }
    }

    public void makeCall(String number)
    {
        sim.doCall(number);
    }

    public void getFreeSpace()
    {
        System.out.println(sdCard.getFreeSpace() + " bytes");
    }

    public void printAllFiles()
    {
        sdCard.getAllFiles();
    }

    //
    // Getter & Setter
    //


    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Sim getSim()
    {
        return sim;
    }

    public void setSim(Sim sim)
    {
        this.sim = sim;
    }

    public Camera getCamera()
    {
        return camera;
    }

    public void setCamera(Camera camera)
    {
        this.camera = camera;
    }

    public SDcard getSdCard()
    {
        return sdCard;
    }

    public void setSdCard(SDcard sdCard)
    {
        this.sdCard = sdCard;
    }
}
