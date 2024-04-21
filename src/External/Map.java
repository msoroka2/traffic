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

    public void printRoad(Road road, SUI.IPrintDriver cp, SUI.CharMatrix cm) {

        cp.printRoad(road, cm);

        for (RoadItem item : road.getRoadItems()) {
            item.printRoadItem(cp, cm);
        }
    }
}
