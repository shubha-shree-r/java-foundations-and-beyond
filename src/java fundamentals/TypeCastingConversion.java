public class TypeCastingConversion {

    public static void main(String[] args) {
        // Implicit Type Conversion
        int num = 10;
        double doubleNum = num;
        System.out.println(doubleNum);
        // Explicit Type Casting
        double price = 9.99;
        int displayPrice = (int) price;
        System.out.println(displayPrice);
    }
}