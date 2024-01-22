package Model;
public class Truck extends Car {
    private double loadWeight;

    public Truck(double currentSpeed, String currentDirection, String currentLocation, double loadWeight) {
        super(currentSpeed, currentDirection, currentLocation);
        this.loadWeight = loadWeight;
    }

    public void setLoadWeight(double weight) {}
}