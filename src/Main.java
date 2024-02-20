import Dynamic.Car;
import Dynamic.Truck;
import Dynamic.Vehicle;
import GUI.ImperialGUI;
import GUI.MetricGUI;
import Simulation.ISimOutput;
import Simulation.ISimInput;
import Constants.Constants;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a unit system:");
        System.out.println("1. Metric");
        System.out.println("2. Imperial");
        int choice = scanner.nextInt();

        ISimInput simInput;
        ISimOutput simOutput;

        if (choice == 1) {
            simInput = new MetricGUI();
            simOutput = new MetricGUI();
        } else {
            simInput = new ImperialGUI();
            simOutput = new ImperialGUI();
        }

        System.out.println("Enter speed limit:");
        double speedLimit = scanner.nextDouble();

        Car car = new Car();
        car.setDesiredSpeed(speedLimit);
        Truck truck1 = new Truck(4);
        truck1.setDesiredSpeed(speedLimit);
        Truck truck2 = new Truck(8);
        truck2.setDesiredSpeed(speedLimit);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);


        for (int i = 0; i < 11; i++) {
            for (Vehicle v : vehicles) {
                double acceleration = getAcceleration(v);
                v.updateSpeed(acceleration);
                System.out.println(v.getClass().getSimpleName() + " speed: " + simOutput.getSpeed(v));
            }
        }
    }

    private static double getAcceleration(Vehicle v) {
        if (v instanceof Car) {
            return Constants.AccRate;
        } else if (v instanceof Truck) {
            Truck truck = (Truck) v;
            if (truck.getLoadWeight() <= 5) {
                return Constants.AccRateEmpty;
            } else {
                return Constants.AccRateFull;
            }
        }
        return 0;
    }
}








