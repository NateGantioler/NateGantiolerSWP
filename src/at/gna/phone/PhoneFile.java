package at.gna.phone;

public class PhoneFile
{
    private String extension;
    private int size;
    private String name;

    //
    // Constructor
    //

    public PhoneFile(String extension, int size, String name)
    {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    //
    // Functions
    //

    public void getInfo()
    {
        System.out.println(this.name + this.extension + "\n- " + this.size + " bytes");
    }

    //
    // Getter & Setter
    //

    public String getExtension()
    {
        return extension;
    }

    public void setExtension(String extension)
    {
        this.extension = extension;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
