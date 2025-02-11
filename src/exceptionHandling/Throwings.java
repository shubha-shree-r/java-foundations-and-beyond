package exceptionHandling;

public class Throwings {

    public static void main(String[] args) {
          double throwNumber = 19.90;

          if(throwNumber <= 20){
              throw new IllegalArgumentException("Insufficient funds. Cannot withdraw " + throwNumber);
          }else{
              System.out.println("true");
          }
    }

}
