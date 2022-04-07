package co.inteleap.course;

import java.util.List;

public class Statement {

    List<Ride> rides;

    public Statement(List rides) {
        this.rides = rides;
    }

    public double getTotalFare() {
        double totalfare =
                rides.stream().map(ride -> ride.getTotalFare()).
                        reduce(0.0D, Double::sum);
        return totalfare;
    }

    public int getNumberOfRides() {
        return rides.size();
    }


    public double getAvgFarePerRide() {
        return getTotalFare() / getNumberOfRides();
    }

}

