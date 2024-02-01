package Dynamic;

import Model.Color;

public class Light extends Dynamic{
    int redTime;
    int yellowTime;
    int greenTime;
    Color lit;
    int timeOn;

    Color getLightColor() {
        return this.lit;
    }
    @Override
    protected void upDate(int second) {

    }
}
