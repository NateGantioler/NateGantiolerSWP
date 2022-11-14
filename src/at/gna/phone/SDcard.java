package at.gna.phone;

import java.util.ArrayList;
import java.util.List;

public class SDcard
{
    private int capacity;
    private ArrayList<PhoneFile> files;

    //
    // Constructor
    //

    public SDcard(int capacity)
    {
        this.capacity = capacity;
        this.files = new ArrayList<PhoneFile>();
    }

    //
    // Functions
    //

    public void saveFile(PhoneFile file)
    {
        files.add(file);
        capacity -= file.getSize();
    }

    public void getAllFiles()
    {
        for(int i = 0; i < files.size(); i++)
        {
           this.files.get(i).getInfo();
        }
    }

    public int getFreeSpace()
    {
        return capacity;
    }
}