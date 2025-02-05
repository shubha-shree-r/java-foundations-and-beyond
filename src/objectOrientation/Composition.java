package objectOrientation;

class Engine{
    private String type;
    private int horsePower;

    public Engine(String type, int horsePower){
       this.type = type;
       this.horsePower = horsePower;
    }

    public void  startEngine() {
        System.out.println("Engine started. Type: " + type + ", Horse Power: " + horsePower);
    }
}

class Car{
    private Engine engine;
    private String brand;
    private String model;


    public Car(Engine engine,String brand,String model){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void  startCar() {
        System.out.println("Starting " + brand + " " + model);
        engine.startEngine();
    }
}
public class Composition {
    public static void main(String[] args) {

        Engine engines = new Engine("48Tb",345);
        Car cars = new Car(engines,"BMW","V8");
        cars.startCar();

    }
}
