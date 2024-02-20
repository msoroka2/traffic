package Dynamic;
import Model.Color;
import Constants.Constants;
public class Truck extends Vehicle {
    private double loadWeight;
    Color trailerColor;

    double currentSpeed;

    public Truck(int weight) {
        loadWeight = weight;
    }


    public void updateSpeed(int acceleration) {
        if (getLoadWeight() <= 5) {
            setCurrentSpeed(getCurrentSpeed() + Constants.AccRateEmpty * acceleration);
        } else {
            setCurrentSpeed(getCurrentSpeed() + Constants.AccRateFull * acceleration);
        }
    }
    public void accelerate(int secondsDelta) {
        if (loadWeight <= 5)
            setCurrentSpeed(getCurrentSpeed() + Constants.AccRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            setCurrentSpeed(getCurrentSpeed() + Constants.AccRateFull * secondsDelta * Constants.MpsToMph);
    }


    protected void decelerate(int secondsDelta) {
        if (loadWeight <= 5)
            setCurrentSpeed(getCurrentSpeed() - Constants.DecRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            setCurrentSpeed(getCurrentSpeed() - Constants.DecRateFull * secondsDelta * Constants.MpsToMph);
    }

    public void setCurrentSpeed(double speed) {
        currentSpeed = speed;
    }

    public double getLoadWeight(){
        return loadWeight;
    }

}
