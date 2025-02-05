package fundamentals;

public class IfLoop {
    String bankAccount = "324873984";
    public static void main(String[] args) {
        IfLoop loop = new IfLoop();
        if(loop.bankAccount == "324873984"){
            System.out.println("Hey!, this is my account number");
        }else{
            System.out.println("Oops!, Invalid number");
        }

        int age = 20;

        if (age >= 181) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
