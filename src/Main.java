import Dynamic.Car;
import Dynamic.Truck;
import Dynamic.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Car car = new Car();
        car.setDesiredSpeed(65.0);
        Truck truck1 = new Truck(4);
        truck1.setDesiredSpeed(55.0);
        Truck truck2 = new Truck(8);
        truck2.setDesiredSpeed(50.0);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {
            for (Vehicle v : vehicles) {
                v.updateSpeed(1);
                System.out.println(v.getClass().getSimpleName() + " speed: " + String.format("%.1f mph", v.getCurrentSpeed()));
            }
        }
    }
    }