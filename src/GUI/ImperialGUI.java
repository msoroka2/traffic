package GUI;

import Constants.Constants;
import Dynamic.Vehicle;
import Road.Road;
import Road.Heading;

public class ImperialGUI extends GUI {

    public Road createRoad(String name, double locx, double locy, double len, Heading hdg) {
        return new Road(name, locx / Constants.MetersToKm, locy / Constants.MetersToKm, len / Constants.MetersToKm, hdg);
    }

    private static final double MPS_TO_MPH = 2.23694;

    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed() * MPS_TO_MPH;
    }


    public void setSpeedLimit(Vehicle v, double s) {
        v.setDesiredSpeed(s / MPS_TO_MPH);
    }
}