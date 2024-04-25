package Road;

import SUI.SUI;

public class TrafficLight extends RoadItem {
    private int redDuration;
    private int yellowDuration;
    private int greenDuration;
    private char marker;
    private int state;

    int seconds;

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

    public char getMarker(){
        return marker;
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
        double position = getMileMarker() * getRoad().getLength();
        int laneWidth = getRoad().getLaneWidth();
        int row = laneWidth / 2;
        int col = (int) Math.round(position);

        if (state == 0) {
            cm.map[row][col] = 'X';
        } else if (state == 1) {
            cm.map[row][col] = '-';
        } else {
            cm.map[row][col] = 'O';
        }

        return null;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
