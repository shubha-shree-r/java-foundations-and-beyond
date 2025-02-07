package enumeration;

public class UsingEnums {


    public enum Operation {
        PLUS,
        MINUS
    }


    public void performOperation(Operation operation, int a, int b) {
        int result;
        switch (operation) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        UsingEnums usingEnums = new UsingEnums();


        usingEnums.performOperation(Operation.PLUS, 20, 10);
        usingEnums.performOperation(Operation.MINUS, 20, 10);
    }
}
