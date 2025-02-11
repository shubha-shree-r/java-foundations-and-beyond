package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class Wrapping {

    public static void main(String[] args) throws FileProcessingException {
        try {
            String fileName = "example.txt";
            Wrapping wrap = new Wrapping();
            wrap.processFile(fileName);
        } catch (FileProcessingException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public void processFile(String fileName) throws FileProcessingException {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                throw new IOException("File not found");
            }


        } catch (IOException e) {
            throw new FileProcessingException("Error processing file: " + fileName, e);
        }
    }

}
class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}