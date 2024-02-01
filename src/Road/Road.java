package Road;

public class Road {
    String name;
    double length;
    RoadItem head;

    void addRoadItem(RoadItem roadItem) {
        head = roadItem;
    }
    double getLength() {
        return this.length;
    }
    String getRoadName() {
        return this.name;
    }

}
