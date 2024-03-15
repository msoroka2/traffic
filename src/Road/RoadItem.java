package Road;

public class RoadItem {
    RoadItem nextItem;
    RoadItem previousItem;
    double mileMarker;

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

    RoadItem getNext() {
        return this.nextItem;
    }

    void setNext(RoadItem item) {
        this.nextItem = item;
    }

    RoadItem getPrevious() {
        return this.previousItem;
    }

    void setPrevious(RoadItem roadItem) {
        this.previousItem = roadItem;
    }
    double getMileMarker() {
        return this.mileMarker;
    }

}
