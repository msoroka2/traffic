package GUI;
import Dynamic.Vehicle;
import Simulation.ISimInput;
import Simulation.ISimOutput;
import Road.Road;
import Road.Heading;

abstract class GUI implements ISimInput, ISimOutput {
    public abstract Road createRoad(String name, double locx, double locy, double len, Heading hdg);

    public abstract double getSpeed(Vehicle v);

    public abstract void setSpeedLimit(Vehicle v, double speed);
}
