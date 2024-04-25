package Road;
import SUI.SUI;

public class TrafficLight extends RoadItem {
    private int redDuration;
    private int yellowDuration;
    private int greenDuration;
    private char marker;
    private int state;

    int timeOn = 0;
    public TrafficLight(int redDuration, int yellowDuration, int greenDuration, char marker, Road road) {
        super(road);
        this.road = road;
        this.redDuration = redDuration;
        this.yellowDuration = yellowDuration;
        this.greenDuration = greenDuration;
        this.marker = marker;
        this.state = 1;
    }
    public double getMileMarker() {
        return mileMarker;
    }
    public void setMileMarker(double mileMarker) {
        this.mileMarker = mileMarker;
    }
    @Override
    public void update(int seconds) {
        timeOn += seconds;

        if (state == 0 && timeOn >= redDuration) {
            state = 2;
            timeOn = 0;
        } else if (state == 1 && timeOn >= yellowDuration) {
            state = 0;
            timeOn = 0;
        } else if (state == 2 && timeOn >= greenDuration) {
            state = 1;
            timeOn = 0;
        }
    }

    @Override
    public Road printRoadItem(SUI.IPrintDriver cp, SUI.CharMatrix cm) {
        SUI.ConsolePrint.printTrafficLight(this, cm);
        return null;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
