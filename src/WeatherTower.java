package src;

public class WeatherTower
{
    public Integer getWeather(int key, Tower x)
    {
        int[] cfw;
        Coordinates c = new Coordinates();
        try {

            cfw = c.getCoordByKey(key, x);
            changeWeather(cfw, c.naming);
            return 0;
        } catch (NullPointerException e){
            return -1;
        }
    }

    public void changeWeather(int[] cords, String name)
    {
        if ((cords[0] < 5))
        {
            System.out.println(name + ": " + "That's is hot!");
        }
    }
}