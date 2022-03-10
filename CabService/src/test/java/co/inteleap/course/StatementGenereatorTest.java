package co.inteleap.course;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementGenereatorTest {

	@Test
	public void shouldCalculateCostForAGivenTime() {
		assertEquals(1,new StatementGenerator().TotalFare(0,1));
	}
	
	@Test
	public void shouldCalculateCostForAGivenDistance() {
		assertEquals(10,new StatementGenerator().TotalFare(1,0));
	}

}
