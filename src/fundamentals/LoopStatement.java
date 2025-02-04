package fundamentals;
import java.util.Scanner;

public class LoopStatement {

    public void whileloop(){
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to finish): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }

    public void forloop(){
        int n = 10; // Number of terms
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
         LoopStatement loops = new LoopStatement();
         loops.whileloop();
         loops.forloop();
    }
}
