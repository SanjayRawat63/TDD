package co.inteleap.course;

import java.util.function.Supplier;

public class Ride {

    private double Distance;
    private double Time;
    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MINUTE = 1;

    public Ride(double distance, double time) {
        this.Distance = distance;
        this.Time = time;
    }

    public Supplier<Double> getTotalFare =
            () -> FARE_PER_KM * Distance + FARE_PER_MINUTE * Time;


}
