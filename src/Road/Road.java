package Road;

import SUI.SUI;

public class Road {
    private String name;
    private double length;
    private double xlocation;
    private double ylocation;
    private Heading heading;
    public static int NumOfRoads = 0;

    public Road(String streetName, double locX, double locY, double len, Heading hdg) {
        name = streetName;
        length = len;
        heading = hdg;
        xlocation = locX;
        ylocation = locY;
        NumOfRoads++;
    }

    public double getLength() { return length; }

    public double getXLocation() { return xlocation; }

    public double getYLocation() { return ylocation; }

    public Heading getHeading() { return heading; }

    public String getRoadName() { return name; }

    public void print(SUI.IPrintDriver print, Object o) {
        print.printRoad(this, o);
    }
}
