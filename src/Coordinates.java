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

    public Integer[] cords;
    public Integer[] getCoordByKey(Integer key, Tower tower)
    {
        String[] coords;
        if (tower.Flyable.get(key).toString() != null)
        {
            naming = tower.Flyable.get(key).toString().split(":")[0];
            String [] mas1 = tower.Flyable.get(key).split(":");
            coords = mas1[1].split(" ");
            System.out.println("TREEE " + coords[0]);
            cords[0] = Integer.parseInt(coords[0]); /// надо разобраться, как это передавать
            cords[1] = Integer.parseInt(coords[1]);
            cords[2] = Integer.parseInt(coords[2]);
            System.out.println("EEEEEEEEEE " + cords[0]);
            return cords;
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