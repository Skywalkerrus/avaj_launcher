package src;

import java.util.HashMap;
public class Tower {

    HashMap <Integer, String> Flyable = new HashMap<>();
    static Integer ii = 1;
    protected static Integer sizeAir = 0;
    public void register(String AirData)
    {
        String[] val = AirData.split(" ");
        String coord = val[2] + " " + val[3] + " " + val[4];
        String naming = val[0] + "#"  + val[1] + "(" + (Flyable.size() + 1) + ")";
        Flyable.put(Flyable.size() + 1, naming + ":" + coord);
        System.out.println("Tower says: " + naming + " registered to weather tower.");
        sizeAir = Flyable.size();
    }

    public void unregister()
    {

        // удаление самолета с его координатами
        System.out.println("Tower says: " + " " + " unregistered to weather tower.");
    }
}