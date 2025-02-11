package objectOrientation;

class Rectangle extends Polymorphism{
     private double length;
     private double width;

     public Rectangle(double length, double width){
         this.length = length;
         this.width = width;
     }

     @Override
    public double calculateArea(){
         return length * width;
     }

     @Override
    public double calculatePerimeter(){
         return 2 * (length + width);
     }

}

class Circle extends Polymorphism{
    private double radius;

    public  Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

public class Polymorphism {
    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(34.5,89.3);

        System.out.println(rectangle.calculateArea()+" Area of Rectangle");
        System.out.println(rectangle.calculatePerimeter()+" Perimeter of Rectangle");

        Circle circle = new Circle(12.34);

        System.out.println(circle.calculateArea()+" Area of Circle");
        System.out.println(circle.calculatePerimeter()+" Perimeter of Circle");
    }
}
