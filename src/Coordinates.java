package src;

public class Coordinates
{
    private int Longitude;
    private int Latitude;
    private int Height;
    String naming;

    /*public Coordinates(int Longitude, int Latitude, int Height)
    {
        Longitude = this.Longitude;
        Latitude = this.Latitude;
        Height = this.Height;
    }*/

    public int[] cords;
    public int[] getCoordByKey(Integer key, Tower tower)
    {
        String[] coords;
        if (tower.Flyable.get(key).toString() != null)
        {
            naming = tower.Flyable.get(key).toString().split(":")[0];
            String [] mas1 = tower.Flyable.get(key).split(":");
            coords = mas1[1].split(" ");
            int numArr[] = new int[coords.length];
            for (int i = 0; i < coords.length; i++) {
                numArr[i] = Integer.parseInt(coords[i]);
            }
            return numArr;
        }
        return null;
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