package arraysAndCollections;

import java.io.FileInputStream;

public class OneDimension {


    public static void main(String[] args) {
        int[] numbers = new int[5];
           numbers[0] = 12;

        System.out.println(numbers[0]);
        System.out.println("  ");
        int[] digits = {10,20,30,40,50,60};

        int firstDigit = digits[0];
        int secondDigit = digits[1];

        digits[2] = 35;

        for(int i =0; i< digits.length; i++){
            System.out.println(digits[i]);
        }

        System.out.println("for each loop:");
        for(int digit : digits){
            System.out.println(digit);
        }


        // fibonacci series example
        Fibonacci fib = new Fibonacci();
        fib.fibonacci[0] = 0;
        fib.fibonacci[1] = 1;
        System.out.println(" ");
        System.out.println("Fibonacci series :");
        for(int i = 2; i < fib.fibonacci.length; i++){
            fib.fibonacci[i] = fib.fibonacci[i-1] + fib.fibonacci[i-2];
            System.out.println(fib.fibonacci[i]);
        }

    }
}

class Fibonacci{
    int[] fibonacci = new int[10];

}