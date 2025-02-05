package fundamentals;

public class Recursive {

    public  int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Recursive recursive = new Recursive();

        System.out.println(recursive.factorial(5));
    }
}
