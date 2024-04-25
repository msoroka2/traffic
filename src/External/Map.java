package External;
import Road.Road;
import SUI.SUI;
import java.util.ArrayList;
import Road.RoadItem;

public class Map {
    private ArrayList<Road> roads;

    public Map() {
        roads = new ArrayList<>();
    }

    public void addRoad(Road road) {
        roads.add(road);
    }
    public void print(SUI.IPrintDriver cp, SUI.CharMatrix cm) {
        for (Road road : roads) {
            cp.printRoad(road, cm);
        }
    }


}