package co.inteleap.course;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class StatementGenereatorTest {

	@Test
	public void shouldCalculateCostForAGivenTime() {
		StatementGenerator statementgenerator=new StatementGenerator();
		List<Ride> rides= Collections.singletonList(new Ride(0,1));
		double totalfare=statementgenerator.create(rides);
		assertEquals(1,totalfare);
	}
	
	@Test
	public void shouldCalculateCostForAGivenDistance() {
		StatementGenerator statementgenerator=new StatementGenerator();
		List<Ride> rides= Collections.singletonList(new Ride(1,0));
		double totalfare=statementgenerator.create(rides);
		assertEquals(10,totalfare);
	}
	
	@Test
	public void shouldCaculateCostForDistanceAndTime() {
		StatementGenerator statementgenerator=new StatementGenerator();
		List<Ride> rides= Collections.singletonList(new Ride(1,1));
		double totalfare=statementgenerator.create(rides);
		assertEquals(11,totalfare);
	}
	
	@Test
	public void shouldCalculateForMultipleJourneyTotalFareForGivenTimeAndDistance()
	{
		StatementGenerator statementgenerator=new StatementGenerator();
		List<Ride> rides= Arrays.asList(new Ride(1,1),new Ride(2,3));
		double totalfare=statementgenerator.create(rides);
		assertEquals(34,totalfare);	
	}

}
