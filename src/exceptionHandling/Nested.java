package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nested {

    public static void main(String[] args) throws FileNotFoundException {
         Nested nest = new Nested();
         nest.processFile();
    }

    public void processFile() throws FileNotFoundException{
     try{
            File file = new File("data.txt");
            Scanner scan = new Scanner(file);

            try{
                int result = performCaluclator(scan);
                System.out.println("Calculation result:" + result);
            }catch(ArithmeticException e){
                System.out.println("An arithmetic exception occurred: " + e.getMessage());
            }

        }catch(FileNotFoundException e){
         System.out.println("File not found: " + e.getMessage());
     }
    }

    public int performCaluclator(Scanner scan){
   int result1 = scan.nextInt();
   int result2 = scan.nextInt();
   return result1/result2;
    }
}
