package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Rethrowing{
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        try {
            FileReader file = new FileReader(fileName);
        } catch (IOException e) {
            System.err.println("Logging error: " + e.getMessage());
            throw e; // Rethrowing the same exception
        }
    }
}
