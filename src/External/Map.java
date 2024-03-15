package External;
import Road.Road;
import SUI.SUI;
import java.util.ArrayList;

public class Map {
    private ArrayList<Road> roads;

    public Map() {
        roads = new ArrayList<>();
    }

    public void addRoad(Road road) {
        roads.add(road);
    }

    public void print(SUI.IPrintDriver pd, Object o) {
        for (Road road : roads) {
            road.print(pd, o);
        }
    }
}
