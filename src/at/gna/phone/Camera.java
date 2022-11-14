package at.gna.phone;

public class Camera
{
    private int resolution;
    private int pictureCount = 1;

    //
    // Constructor
    //

    public Camera(int resolution)
    {
        this.resolution = resolution;
    }

    //
    // Functions
    //

    public PhoneFile makePicture()
    {
        PhoneFile picture = new PhoneFile(".png", resolution, "Picture" + pictureCount);
        pictureCount++;
        return picture;
    }
}
