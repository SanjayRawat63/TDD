package co.inteleap.course;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Statement {

    List<Ride> rides;

    public Statement(List rides) {
        this.rides = rides;
    }

    public double getTotalFare()
    {
        double totalfare=0;
        for(Ride ride:rides)
            totalfare+= ride.getTotalFare.get();

        return totalfare;
    }


    public Supplier<Integer> getNumberOfRides =
            () -> rides.size();

    public Supplier<Double> getAvgFarePerRide =
            () -> getTotalFare() / getNumberOfRides.get();


}

