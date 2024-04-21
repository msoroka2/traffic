import Dynamic.Vehicle;
import java.util.Timer;
import java.util.TimerTask;
import GUI.MetricGUI;
import Road.Heading;
import Road.Road;
import Road.RoadItem;
import SUI.SUI;
import Constants.Constants;
import External.Map;
import Simulation.ISimInput;
import Road.TrafficLight;
import Simulation.Simulation;


public class Main {
    public static void main(String[] args) {
        ISimInput simInput;
        Map map = new Map();
        SUI.IPrintDriver cp = new SUI.ConsolePrint();

        simInput = new MetricGUI();
        Road uptown = ((MetricGUI) simInput).createRoad("uptown", 0.0, -0.09, 160.0, Heading.North);
        map.addRoad(uptown);

        TrafficLight trafficLight1 = new TrafficLight(10, 5, 15, 'X', uptown);
        trafficLight1.setMileMarker(0.000050);
        TrafficLight trafficLight2 = new TrafficLight(8, 10, 12, 'O', uptown);
        trafficLight2.setMileMarker(0.000065);
        uptown.addRoadItem(trafficLight1);
        uptown.addRoadItem(trafficLight2);

        System.out.println("Traffic Light 1 mile marker: " + trafficLight1.getMarker());
        System.out.println("Traffic Light 2 mile marker: " + trafficLight2.getMarker());

        SUI.CharMatrix cm = new SUI.CharMatrix();

        // simulation starts
        Simulation simulation = new Simulation();
        simulation.addDynamicRoadItem(trafficLight1);
        simulation.addDynamicRoadItem(trafficLight2);

        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                trafficLight1.update(1);
                simulation.update();
            }
        }, 0, 1000);

        Timer timer2 = new Timer();
        timer2.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                trafficLight2.update(1);
                simulation.update();
            }
        }, 0, 1000);

        Timer displayTimer = new Timer();
        displayTimer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                SUI.ConsoleClear();


                map.printRoad(uptown, cp, cm);
                for (int i = 0; i < Constants.CharMapSize; i++) {
                    String s = new String(cm.map[i]);
                    System.out.println(s);
                }
            }
        }, 0, 1000);
    }
    }



