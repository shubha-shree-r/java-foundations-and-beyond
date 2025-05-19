package lambdaExpressions;

@FunctionalInterface
interface Cab{
    void bookCab();
}
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Cab cab = ()-> System.out.println("Ola cab is booked....");
        cab.bookCab();
    }
}
