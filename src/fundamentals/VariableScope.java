package fundamentals;

public class VariableScope {
    private int instanceVar; // Class level scope

    public int method1() {
        int localVar = 10; // Method level scope
        System.out.println("Local Variable: " + localVar);

        if (localVar > 5) {
            int blockVar = 20; // Block level scope
            System.out.println("Block Variable: " + blockVar);
        }

        // blockVar is not accessible here
        return localVar;
    }

    public int method2() {
        // localVar is not accessible here
        System.out.println("Instance Variable: " + instanceVar);
        return 0;
    }

    public static void main(String[] args) {
        VariableScope variables = new VariableScope();
        variables.method1();
        variables.method2();
    }
}
