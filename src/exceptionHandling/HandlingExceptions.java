package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File file = new File("data.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }
}
