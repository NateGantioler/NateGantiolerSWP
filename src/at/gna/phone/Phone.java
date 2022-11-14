package at.gna.phone;

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

    public void takePicture()
    {
        sdCard.saveFile(camera.makePicture());
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
