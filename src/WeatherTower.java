package src;

public class WeatherTower
{
    public Integer getWeather(int key, Tower x)
    {
        Integer[] cfw;
        Coordinates c = new Coordinates();
        try {

            cfw = c.getCoordByKey(key, x);
            System.out.println("CFW: " + cfw[0]);
            changeWeather(cfw, c.naming);
            return 0;
        } catch (NullPointerException e){
            System.out.println("OCHAKOVO");
            return -1;
        }
    }

    public void changeWeather(Integer[] cords, String name)
    {
        if ((cords[0] < 5))
        {
            System.out.println(name + ": " + "That's is hot!");
        }
    }
}