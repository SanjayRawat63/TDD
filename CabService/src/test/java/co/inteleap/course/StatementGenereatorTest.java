package co.inteleap.course;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class StatementGenereatorTest {

	@Test
	public void shouldCalculateCostForAGivenTime() {
		List<Ride> rides= Collections.singletonList(new Ride(0,1));
		Statement statement=new Statement(rides);
		assertEquals(1,statement.getTotalFare());
		assertEquals(1,statement.getNumberOfRides());
		assertEquals(1,statement.getAvgFarePerRide());
	}
	
	@Test
	public void shouldCalculateCostForAGivenDistance() {
		List<Ride> rides= Collections.singletonList(new Ride(1,0));
		Statement statement=new Statement(rides);
		assertEquals(10,statement.getTotalFare());
		assertEquals(1,statement.getNumberOfRides());
		assertEquals(10,statement.getAvgFarePerRide());
	}
	
	@Test
	public void shouldCaculateCostForDistanceAndTime() {
		List<Ride> rides= Collections.singletonList(new Ride(1,1));
		Statement statement=new Statement(rides);
		assertEquals(11,statement.getTotalFare());
		assertEquals(1,statement.getNumberOfRides());
		assertEquals(11,statement.getAvgFarePerRide());
	}
	
	@Test
	public void shouldCalculateForMultipleJourneyTotalFareForGivenTimeAndDistance()
	{
		List<Ride> rides= Arrays.asList(new Ride(1,1),new Ride(2,3));
		Statement statement=new Statement(rides);
		assertEquals(34,statement.getTotalFare());	
		assertEquals(2,statement.getNumberOfRides());
		assertEquals(17,statement.getAvgFarePerRide());
	}

}
