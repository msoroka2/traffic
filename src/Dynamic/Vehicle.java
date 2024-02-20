package Dynamic;

import Dynamic.Dynamic;
import Model.Color;

public class Vehicle {
    private double currentSpeed;
    private double desiredSpeed;
    private double speedLimit;
    private Color color;

    public void updateSpeed(double acceleration) {
        if (currentSpeed < desiredSpeed) {
            currentSpeed += acceleration;
            if (currentSpeed > desiredSpeed) {
                currentSpeed = desiredSpeed;
            }
        } else if (currentSpeed > desiredSpeed) {
            currentSpeed -= acceleration;
            if (currentSpeed < desiredSpeed) {
                currentSpeed = desiredSpeed;
            }
        }
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setDesiredSpeed(double desiredSpeed) {
        this.desiredSpeed = desiredSpeed;
    }
}
