package co.inteleap.course;

import java.util.List;

public class Statement{
        List<Ride> rides;
		
        public Statement(List rides)
		{
			this.rides=rides;
		}
		
		public double getTotalFare()
		{
			double totalfare=0;
			for(Ride ride:rides)
			    totalfare+= ride.getTotalFare();
			
		   return totalfare;
		}
		
		public int getNumberOfRides()
		{
			return rides.size();
		}
		
		public double getAvgFarePerRide()
		{
			return getTotalFare()/getNumberOfRides();
		}
		
		
	}

