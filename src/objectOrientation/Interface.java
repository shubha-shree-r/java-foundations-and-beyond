package objectOrientation;

interface Drawable{
    void draw();
}

interface Resize{
    void resizeable(double factor);
}

class Square implements Drawable, Resize{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a square width side : " + side);
    }

    @Override
    public void resizeable(double factor){
        side *= factor;
        System.out.println("Resizing the square. New side : " + side);
    }
}

public class Interface {

    public static void main(String[] args) {
        Drawable square = new Square(4);
        Resize squares = new Square(9);

        square.draw();
        squares.resizeable(3);
    }
}
