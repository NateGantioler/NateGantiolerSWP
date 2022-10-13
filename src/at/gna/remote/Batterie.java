package at.gna.remote;

public class Batterie
{
    private float chargingStatus;

    public Batterie(float chargingStatus)
    {
        this.chargingStatus = chargingStatus;
    }


    //
    // Getter & Setter
    //

    public float getChargingStatus()
    {
        return chargingStatus;
    }

    public void setChargingStatus(float chargingStatus)
    {
        this.chargingStatus = chargingStatus;
    }
}
