package Road;

import java.util.ArrayList;

public class Road {
    private final ArrayList<RoadItem> roadItems;
    private String name;
    private double length;
    private double xlocation;
    private double ylocation;
    private Heading heading;
    int laneWidth;

    public Road(String streetName, double locX, double locY, double len, Heading hdg) {
        name = streetName;
        length = len;
        heading = hdg;
        xlocation = locX;
        ylocation = locY;
        this.roadItems = new ArrayList<>();
    }

    public double getLength() { return length; }

    public double getXLocation() { return xlocation; }

    public double getYLocation() { return ylocation; }

    public Heading getHeading() { return heading; }

    public String getRoadName() { return name; }

    public void addRoadItem(RoadItem roadItem) {
        roadItems.add(roadItem);
    }

    public int getLaneWidth() {

        return laneWidth;
    }
    public ArrayList<RoadItem> getRoadItems() {
        return roadItems;
    }
}