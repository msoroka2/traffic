package Dynamic;
import Dynamic.Dynamic;
import Model.Color;

public class Vehicle extends Dynamic{

    double currentSpeed;
    double desiredSpeed;
    double speedLimit;
    Color color;

    @Override
    protected void upDate(int second) {

    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setDesiredSpeed(double desiredSpeed) {
        this.desiredSpeed = desiredSpeed;
    }
}

