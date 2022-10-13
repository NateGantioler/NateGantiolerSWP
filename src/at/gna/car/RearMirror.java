package at.gna.car;

public class RearMirror
{
    private int size;
    private int position; //0- Neutral -10 Nach Links +10 nach rechts

    public RearMirror(int size, int position)
    {
        this.size = size;
        this.position = position;
    }

    //
    // Getter & Setter
    //

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }
}
