package co.Interleap.courses.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementGeneratorTest {

	@Test
	void shouldCalculateCostForAGivenTime() {
		assertEquals(1,new StatementGenerator().TotalCost(0,1));
	}	
	

}
