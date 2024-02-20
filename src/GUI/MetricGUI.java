package GUI;

import Dynamic.Vehicle;

public class MetricGUI extends GUI {

    private static final double MPS_TO_KPH = 3.6;

    @Override
    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed() * MPS_TO_KPH;
    }

    @Override
    public void setSpeedLimit(Vehicle v, double s) {
        v.setDesiredSpeed(s / MPS_TO_KPH);
    }

}
