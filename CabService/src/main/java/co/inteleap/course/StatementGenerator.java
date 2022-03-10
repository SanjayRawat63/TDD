package co.inteleap.course;

import java.util.List;

public class StatementGenerator {
	public static final int FARE_PER_KM=10;
	public static final int FARE_PER_MINUTE=1;
	
	public double create(List<Ride> rides)
	{
		Ride ride=rides.get(0);
		return FARE_PER_KM * ride.getDistance() + FARE_PER_MINUTE *ride.getTime();
	}
	
}
