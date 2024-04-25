package Dynamic;

import Road.Road;
import Road.RoadItem;

public abstract class  Dynamic extends RoadItem {
    public Dynamic(Road road) {
        super(road);
    }

    protected abstract void upDate(int second);
}
