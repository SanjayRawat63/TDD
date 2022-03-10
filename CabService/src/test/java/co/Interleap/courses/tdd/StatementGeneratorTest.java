package co.Interleap.courses.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementGeneratorTest {

	@Test
	void shouldCalculateCostForAGivenTime() {
		assertEquals(1,new StatementGenerator().TotalCost(0,1));
	}
	
	@Test
	void shouldCalculateCostForAGivenDistance() {
		assertEquals(10,new StatementGenerator().TotalCost(1,0));
	}
	

}
