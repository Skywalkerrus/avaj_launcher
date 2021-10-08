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
        String upCon;
        String[] coords;
        if (tower.Flyable.get(key).toString() != null)
        {
            naming = tower.Flyable.get(key).toString().split(":")[0];
            upCon = naming.split("#")[0];
            //System.out.println("NAMEING: " + upCon);
            String [] mas1 = tower.Flyable.get(key).split(":");
            coords = mas1[1].split(" ");
            int numArr[] = new int[coords.length];
            //switch
            for (int i = 0; i < coords.length; i++) {
                numArr[i] = Integer.parseInt(coords[i]); // здесь нужно обновлять координаты в з
                // зависимости от класса авиа-транспорта, то есть, если это helicopter,
                // то идем в helicopter.updateConditions
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