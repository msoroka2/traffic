package Dynamic;

import Dynamic.Vehicle;
import Model.Color;

public class Truck extends Vehicle {
    private double loadWeight;
    Color trailerColor;

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}