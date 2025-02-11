package fundamentals;

public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        // Comparison Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreaterThan);
        System.out.println(isLessThan);
        System.out.println(isGreaterOrEqual);
        System.out.println(isLessOrEqual);

        // Logical Operators
        boolean a1 = true;
        boolean b1 = false;
        boolean result1 = a1 && b1;
        boolean result2 = a1 || b1;
        boolean result3 = !a1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}