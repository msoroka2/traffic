package GUI;

import Dynamic.Vehicle;

public class ImperialGUI extends GUI {

    private static final double MPS_TO_MPH = 2.23694;

    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed() * MPS_TO_MPH;
    }


    public void setSpeedLimit(Vehicle v, double s) {
        v.setDesiredSpeed(s / MPS_TO_MPH);
    }
}