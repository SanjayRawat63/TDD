package co.inteleap.course;

import java.util.List;

public class StatementGenerator {

	public double create(List<Ride> rides)
	{
		double totalfare=0;
		for(Ride ride: rides)
		    totalfare+= ride.getTotalFare();
	   return totalfare;
	}
	
}
