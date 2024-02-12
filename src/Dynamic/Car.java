package Dynamic;
import Constants.Constants;
public class Car extends Vehicle{
    private double currentSpeed;
    private String currentDirection;
    private String currentLocation;

    public void accelerate(double toSpeed) {}

    public void decelerate(double toSpeed) {}

    public void turn(String direction, double degrees) {}

//    @Override
//    protected void accelerate(int secondsDelta) {
//        setCurrentSpeed(getCurrentSpeed() + Constants.AccRate * secondsDelta * Constants.MpsToMph);
//    }
//    @Override
//    protected void decelerate(int secondsDelta) {
//        setCurrentSpeed(getCurrentSpeed() - Constants.DecRate * secondsDelta * Constants.MpsToMph);
//    }
}