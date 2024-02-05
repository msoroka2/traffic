package Road;

public class RoadItem {
    RoadItem nextItem;
    RoadItem previousItem;
    double mileMarker;
    Road currentRoad;

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

    Road getCurrentRoad() {
        return this.currentRoad;
    }

    void setCurrentRoad(Road road) {
        this.currentRoad = road;
    }
}
