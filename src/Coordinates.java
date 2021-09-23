package src;

public class Coordinates
{
    private int Longitude;
    private int Latitude;
    private int Height;

    public Coordinates(int Longitude, int Latitude, int Height)
    {
        Longitude = this.Longitude;
        Latitude = this.Latitude;
        Height = this.Height;
    }

    public Integer getLongitude(int Longitude)
    {
        return Longitude;
    }

    public Integer getLatitude(int Latitude)
    {
        return Latitude;
    }

    public Integer getHeight(int Height)
    {
        return Height;
    }
}