package SUI;
import Dynamic.Car;
import Road.Road;
import Simulation.Conversions;
import Constants.Constants;

public class SUI {
    public static final int CharMapSize = 40;
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
        void printCar(Car car, Object o);
    }

    public static class ConsolePrint implements IPrintDriver {
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
        }

        public void printCar(Car car, Object o) {

        }
    }
}
