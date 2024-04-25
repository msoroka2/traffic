package SUI;

import Dynamic.Car;
import Road.Road;
import Road.RoadItem;
import Simulation.Conversions;
import Constants.Constants;
import Road.TrafficLight;

public class SUI {
    public static final int CharMapSize = 40;

    public static void ConsoleClear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static class CharMatrix {
        public char[][] map = new char[Constants.CharMapSize][];

        public CharMatrix() {
            for (int i = 0; i < Constants.CharMapSize; i++) {
                map[i] = new char[Constants.CharMapSize];
                for (int j = 0; j < Constants.CharMapSize; j++)
                    map[i][j] = ' ';
            }
        }
    }

    public interface IPrintDriver {
        void printRoad(Road road, Object o);
    }

    public static class ConsolePrint implements IPrintDriver {
        @Override
        public void printRoad(Road road, Object o) {
            CharMatrix cm = (CharMatrix) o;
            int x, y;
            int CCx = Conversions.WCpointToCCpoint(road.getXLocation());
            int CCy = Conversions.WCpointToCCpoint(-road.getYLocation());
            int distance = 0;
            int CCRoadLength = Conversions.WClengthToCClength(road.getLength());
            switch (road.getHeading()) {
                case North:
                    x = (int) CCx;
                    if (x >= 0 && x < Constants.CharMapSize) {
                        while (distance < CCRoadLength) {
                            y = (int) (CCy - distance);
                            if (y >= 0 && y < Constants.CharMapSize) {
                                cm.map[y][x] = '|';
                                cm.map[y][x + 2] = '|';
                                cm.map[y][x + 4] = '|';
                            }
                            distance += 1;
                        }
                    }
                    break;
                case South:
                    break;
                case East:
                    y = (int) CCy;
                    if (y >= 0 && y < Constants.CharMapSize) {
                        while (distance < CCRoadLength) {
                            x = (int) (CCx + distance);
                            if (x >= 0 && x < Constants.CharMapSize) {
                                cm.map[y][x] = '-';
                                cm.map[y + 2][x] = '-';
                                cm.map[y + 4][x] = '-';
                            }
                            distance += 1;
                        }
                    }
                    break;
                case West:
                    break;
                default:
                    break;
            }
            for (RoadItem item : road.getRoadItems()) {
                item.printRoadItem(this, cm);
            }
        }

        public void onPrintRequested(Road road, CharMatrix cm) {
            printRoad(road, cm);

            for (RoadItem item : road.getRoadItems()) {
                if (item instanceof TrafficLight) {
                    printTrafficLight((TrafficLight) item, cm);
                }

            }
        }

        private void printTrafficLight(TrafficLight trafficLight, CharMatrix cm) {
            double position = trafficLight.getMileMarker() * trafficLight.getRoad().getLength();
            int laneWidth = trafficLight.getRoad().getLaneWidth();
            int row = laneWidth / 2;
            int col = (int) Math.round(position);

            if (trafficLight.getState() == 0) {
                cm.map[row][col] = 'X';
            } else if (trafficLight.getState() == 1) {
                cm.map[row][col] = '-';
            } else {
                cm.map[row][col] = 'O';
            }
        }
    }
}
