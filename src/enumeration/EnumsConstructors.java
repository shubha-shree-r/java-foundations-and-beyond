package enumeration;

public class EnumsConstructors {

    public enum VechileType{
        CAR(4),
        TRUCK(5),
        CYCLE(7);

        private int wheelsCount;

        VechileType(int wheelsCount){
            this.wheelsCount = wheelsCount;
        }

        public int getWheelsCount(){
            return wheelsCount;
        }
    }


    public static void main(String[] args) {
        int carwheels = VechileType.CAR.getWheelsCount();
        int cyclewheels = VechileType.CYCLE.getWheelsCount();
        int truckwheels = VechileType.TRUCK.getWheelsCount();

        System.out.println(carwheels);
        System.out.println(cyclewheels);
        System.out.println(truckwheels);
    }
}
