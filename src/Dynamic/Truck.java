package Dynamic;
import Model.Color;
import Constants.Constants;
public class Truck extends Vehicle {
    private double loadWeight;
    Color trailerColor;

    public Truck(int weight) {
        loadWeight = weight;
    }

    @Override
    protected void accelerate(int secondsDelta) {
        if (loadWeight <= 5)
            setCurrentSpeed(getCurrentSpeed() + Constants.AccRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            setCurrentSpeed(getCurrentSpeed() + Constants.AccRateFull * secondsDelta * Constants.MpsToMph);
    }

    @Override
    protected void decelerate(int secondsDelta) {
        if (loadWeight <= 5)
            setCurrentSpeed(getCurrentSpeed() - Constants.DecRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            setCurrentSpeed(getCurrentSpeed() - Constants.DecRateFull * secondsDelta * Constants.MpsToMph);
    }

}
