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

//    protected abstract void accelerate(int secondsDelta);
//    protected abstract void decelerate(int secondsDelta);

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setDesiredSpeed(double mph) {
        desiredSpeed = mph;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

//    public void updateSpeed(int seconds) {
//        if (currentSpeed > desiredSpeed) decelerate(seconds);
//        else if (currentSpeed < desiredSpeed) accelerate(seconds);
//    }
}
