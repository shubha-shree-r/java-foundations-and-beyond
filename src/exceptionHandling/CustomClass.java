package exceptionHandling;

public class CustomClass {

    public static void main(String[] args) {
        try {
            registerUser(15);
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
            System.out.println("Invalid age: " + e.getAge());
        }
    }
    public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old.", age);
        }

    }
}

 class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(String message, int age) {
        super(message);
        this.age = age;
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public int getAge() {
        return age;
    }
}
