package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Multithreaded {

    public static void main(String[] args){

        try{
             String threadName = "ThreadFile.txt";
             Multithreaded multi = new Multithreaded();
             multi.startThread(threadName);

        }catch (IOException e){
            System.out.println("Error Found" + e.getMessage());
        }


    }
    public void startThread(String name) throws IOException{
          Thread thread1 = new Thread(() ->{
              try{
                  FileReader file = new FileReader(name);
              }catch (Exception e){
                  System.err.println("Error Exception Thread1: " + e.getMessage());
              }
          });

         Thread thread2 = new Thread(() -> {
             try{
                 FileReader file = new FileReader(name);
             }catch (Exception e){
                 System.err.println("Error Exception Thread2: " + e.getMessage());
             }
         });
        thread1.start();
        thread2.start();
    }

}
