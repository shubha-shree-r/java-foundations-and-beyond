package objectOrientation;

public class Inheritance {
     protected String name;


     public Inheritance(String name){
         this.name = name;

     }

     public void studentName() {
         System.out.println(name + " is from class 10th");


     }

    public static void main(String[] args) {
        Inheritance inherit = new Inheritance("Shubha");
         inherit.studentName();

         Student students = new Student("Jeevan");
         students.studentName();
    }
}

 class Student extends Inheritance{

    public Student(String name) {
        super(name);
    }

    @Override
    public void studentName() {
        System.out.println(name + " is from class 5th");

    }
}
