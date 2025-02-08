package enumeration;

import java.io.*;

public class EnumsSerializable {
    public enum VehicleTypes implements Serializable {
        CAR(4),
        MOTORCYCLE(2),
        TRUCK(6);

        private int wheelsCount;

        VehicleTypes(int wheelsCount) {
            this.wheelsCount = wheelsCount;
        }

        public int getWheelsCount(){
            return wheelsCount;
        }
    }

    public static void main(String[] args) {
        VehicleTypes vehicle = VehicleTypes.CAR;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehicle.ser"))) {
            out.writeObject(vehicle);
        } catch (IOException e) {
            e.printStackTrace();
        }

        VehicleTypes deserializedVehicle = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("vehicle.ser"))) {
            deserializedVehicle = (VehicleTypes) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialized vehicle: " + deserializedVehicle);
    }
}
