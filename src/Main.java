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
        try {
            File f1 = new File(fileName);
            BufferedReader bf1 = new BufferedReader(new FileReader(fileName));
            try {
                Integer cycles = Integer.parseInt(bf1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}