package Model;

public class Car {
    private double currentSpeed;
    private String currentDirection;
    private String currentLocation;

    public Car(double currentSpeed, String currentDirection, String currentLocation) {
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
        this.currentLocation = currentLocation;
    }

    public void accelerate(double toSpeed) {}

    public void decelerate(double toSpeed) {}

    public void turn(String direction, double degrees) {}

}