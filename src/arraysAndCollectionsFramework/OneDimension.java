package arraysAndCollectionsFramework;

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

    }
}
