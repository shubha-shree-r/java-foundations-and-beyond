package objectOrientation;

abstract class Shape{
    public abstract String studentName();
    public abstract String studentDetails();
}

class Students extends Shape{
    private String firstName;
    private String lastName;
    private String address;

    public Students(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String studentName(){
        return firstName + "" + lastName;
    }

    @Override
    public  String studentDetails(){
        return address;
    }


}
public class Abstract {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Students("Shubha","Jeevan","Bangalore");

        for (Shape shape : shapes) {
            System.out.println("Student Name: " + shape.studentName());
            System.out.println("Student Address: " + shape.studentDetails());
            System.out.println();
        }

    }
}
