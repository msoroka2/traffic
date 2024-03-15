import Dynamic.Vehicle;
import GUI.MetricGUI;
import Road.Heading;
import Road.Road;
import SUI.SUI;
import Constants.Constants;
import External.Map;
import Simulation.ISimInput;

public class Main {
        public static void main(String[] args) {

                ISimInput simInput;
                Map map = new Map();
                SUI.IPrintDriver cp = new SUI.ConsolePrint();

                simInput = new MetricGUI();
                Road uptown = ((MetricGUI) simInput).createRoad("Uptown", 0.0, -0.09, .180, Heading.North);
                map.addRoad(uptown);
                Road crosstown = ((MetricGUI) simInput).createRoad("Crosstown", -0.09, 0.0, .180, Heading.East);
                map.addRoad(crosstown);

                SUI.CharMatrix cm = new SUI.CharMatrix();
                map.print(cp, cm);
                for (int i = 0; i < Constants.CharMapSize; i++) {
                    String s = new String(cm.map[i]);
                    System.out.println(s);
                }
            }

            public double getSpeed(Vehicle v) {
                return v.getCurrentSpeed() * Constants.MpsToMph;
            }

            public void setSpeedLimit(Vehicle v, double speed) {
                v.setDesiredSpeed(speed / Constants.MpsToMph);
            }
        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Pick a unit system:");
//        System.out.println("1. Metric");
//        System.out.println("2. Imperial");
//        int choice = scanner.nextInt();


//        if (choice == 1) {
//            simInput = new MetricGUI();
//            simOutput = new MetricGUI();
//        } else {
//            simInput = new ImperialGUI();
//            simOutput = new ImperialGUI();
//        }
//
//        System.out.println("Enter speed limit:");
//        double speedLimit = scanner.nextDouble();

//        Car car = new Car();
//        car.setDesiredSpeed(speedLimit);
//        Truck truck1 = new Truck(4);
//        truck1.setDesiredSpeed(speedLimit);
//        Truck truck2 = new Truck(8);
//        truck2.setDesiredSpeed(speedLimit);
//
//        ArrayList<Vehicle> vehicles = new ArrayList<>();
//        vehicles.add(car);
//        vehicles.add(truck1);
//        vehicles.add(truck2);
//
//
//        for (int i = 0; i < 11; i++) {
//            for (Vehicle v : vehicles) {
//                double acceleration = getAcceleration(v);
//                v.updateSpeed(acceleration);
//                System.out.println(v.getClass().getSimpleName() + " speed: " + simOutput.getSpeed(v));
//            }
//        }
//    }
//
//    private static double getAcceleration(Vehicle v) {
//        if (v instanceof Car) {
//            return Constants.AccRate;
//        } else if (v instanceof Truck) {
//            Truck truck = (Truck) v;
//            if (truck.getLoadWeight() <= 5) {
//                return Constants.AccRateEmpty;
//            } else {
//                return Constants.AccRateFull;
//            }
//        }
//        return 0;
//    }









