package Road;

import SUI.SUI;

public class TrafficLight extends RoadItem {
    private int redDuration;
    private int yellowDuration;
    private int greenDuration;
    private char marker;
    private int state;

    public TrafficLight(int redDuration, int yellowDuration, int greenDuration, char marker, Road road) {
        super(road);
        this.road = road;
        this.redDuration = redDuration;
        this.yellowDuration = yellowDuration;
        this.greenDuration = greenDuration;
        this.marker = marker;
        this.state = 0;
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

        redDuration -= seconds;
        yellowDuration -= seconds;
        greenDuration -= seconds;

        if (state == 0) {
            if (redDuration <= 0) {
                state = 2;
            }
        } else if (state == 1) {
            if (yellowDuration <= 0) {
                state = 0;
            }
        } else {
            if (greenDuration <= 0) {
                state = 1;
            }
        }
    }


    @Override
    public Road printRoadItem(SUI.IPrintDriver cp, SUI.CharMatrix cm) {
        double position = getMileMarker() * getRoad().getLength();
        int laneWidth = getRoad().getLaneWidth();
        int row = laneWidth / 2;
        int col = (int) Math.round(position);

        char marker = getMarker();

        if (state == 0) {
            cm.map[row][col] = marker; // red light
        } else if (state == 1) {
            cm.map[row][col] = '-'; // yellow light
        } else {
            cm.map[row][col] = marker; // green light
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
