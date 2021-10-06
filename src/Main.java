package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main 
{
    public static void main(String[] args)
    {
        get_info(args[0]);
    }
    
    public static void get_info(String fileName)
    {
        Tower x = new Tower();
        try {
            File f1 = new File(fileName);
            BufferedReader bf1 = new BufferedReader(new FileReader(fileName));
            try {
                Integer cycles = Integer.parseInt(bf1.readLine()); // колличество циклов смены погоды
                String debug = bf1.readLine();
                while (debug != null)
                {
                    x.register(debug);
                    debug = bf1.readLine();
                }
                bf1.close();
                checkStatusWeather(x);            
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        
    }

    public static void checkStatusWeather(Tower t1)
    {
        WeatherTower wt = new WeatherTower();
        int i = t1.sizeAir;
        int j = 1;
        while (j <= i)
        {
            if (wt.getWeather(j, t1) == 0)
                j++;
            else
                break;
        }
    }
}