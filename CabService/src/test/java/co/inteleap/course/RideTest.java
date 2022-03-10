package co.inteleap.course;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RideTest {

	@Test
	public void shouldCalculateFareForGivenTime() {
		Ride ride=new Ride(0,1);
		assertEquals(1,ride.getTotalFare());
	}
	
	@Test
	public void shouldCalculateFareForGivenDistance() {
		Ride ride=new Ride(1,0);
		assertEquals(10,ride.getTotalFare());
	}
	
	@Test
	public void shouldCalculateFareForGivenTimeAndDistance() {
		Ride ride=new Ride(0,1);
		assertEquals(1,ride.getTotalFare());
	}

}
