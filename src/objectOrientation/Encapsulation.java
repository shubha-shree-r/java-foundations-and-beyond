package objectOrientation;

public class Encapsulation {

        private String accountNumber;
        private double balance;

        public Encapsulation(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Invalid withdrawal amount");
            }
        }

    public static void main(String[] args) {
        Encapsulation encapsulate = new Encapsulation("213872834324",32434);
        encapsulate.getBalance();
        encapsulate.getAccountNumber();
        encapsulate.deposit(128923.34);
        encapsulate.withdraw(128923.34);
        System.out.println(encapsulate.accountNumber);
        System.out.println(encapsulate.balance);

    }

}
