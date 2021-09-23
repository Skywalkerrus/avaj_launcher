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
                System.out.println("\n\nELEMENTS --> " + x.Flyable.size() + "\nVAL ---> " + x.Flyable.get(1));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}