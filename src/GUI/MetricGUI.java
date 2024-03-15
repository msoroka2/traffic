package GUI;
import Dynamic.Vehicle;
import Constants.Constants;
import Road.Heading;
import Road.Road;

public class MetricGUI extends GUI {

    public Road createRoad(String name, double locx, double locy, double len, Heading hdg) {
        return new Road(name, locx / Constants.MetersToKm, locy / Constants.MetersToKm, len / Constants.MetersToKm, hdg);
    }

    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed() * Constants.MpsToKph;
    }

    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / Constants.MpsToKph);
    }
}
