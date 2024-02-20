package GUI;
import Dynamic.Vehicle;
import Simulation.ISimInput;
import Simulation.ISimOutput;

abstract class GUI implements ISimInput, ISimOutput {

    public abstract double getSpeed(Vehicle v);

    public abstract void setSpeedLimit(Vehicle v, double speed);

}