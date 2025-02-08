package enumeration;



public class EnumInheritance {
  public interface Drivable{
    void drive();
    void stop();
  }

  public enum VechileType implements Drivable{
      CAR(4){
        @Override
        public void drive() {
          System.out.println("Driving a car");
        }
        @Override
        public void stop(){
          System.out.println("Stopping a car");
        }
      },
      TRUCK(7){
        @Override
        public void drive(){
          System.out.println("Driving a truck");
        }

        @Override
        public void stop(){
          System.out.println("Stopping a truck");
        }
      };

      private int wheelCounts;

     VechileType(int wheelCounts){
        this.wheelCounts = wheelCounts;
      }

      public int getWheelCounts(){
       return wheelCounts;
    }
  }

  public static void main(String[] args) {
    VechileType car = VechileType.CAR;
    VechileType truck = VechileType.TRUCK;


    car.drive();
    car.stop();

    truck.drive();
    truck.stop();

    System.out.println("Car has " + car.getWheelCounts() + " wheels.");
    System.out.println("Truck has " + truck.getWheelCounts() + " wheels.");
  }
}
