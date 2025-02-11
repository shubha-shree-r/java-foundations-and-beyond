package genericsAndLambda;

interface Comparables<T> {
    int compareTo(T other);
}

public class BoundParameter implements Comparables<BoundParameter> {
    private int num1;
    private int num2;

    public BoundParameter(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int compareTo(BoundParameter other) {
        // Compare based on sum of num1 and num2
        return Integer.compare(this.num1 + this.num2, other.num1 + other.num2);
    }

    public static void main(String[] args) {
        BoundParameter max1 = new BoundParameter(20, 10);
        BoundParameter max2 = new BoundParameter(70, 10);
        BoundParameter maxobj = findMax(max1,max2);

        System.out.println("The object with the larger sum is: (" + maxobj.num1 + ", " + maxobj.num2 + ")");

    }


    public static <T extends Comparables<T>> T findMax(T num1, T num2) {
        return (num1.compareTo(num2) > 0) ? num1 : num2;
    }
}
