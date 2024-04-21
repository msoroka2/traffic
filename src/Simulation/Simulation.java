package Simulation;
//import Dynamic.Dynamic;
import Road.RoadItem;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private List<RoadItem> dynamicRoadItems;

    public Simulation() {
        dynamicRoadItems = new ArrayList<>();
    }

    public void addDynamicRoadItem(RoadItem roadItem) {
        dynamicRoadItems.add(roadItem);
    }

    public List<RoadItem> getDynamicRoadItems() {
        return dynamicRoadItems;
    }
    public void update() {
        for (RoadItem roadItem : dynamicRoadItems) {
            roadItem.update(1);
        }
    }
}