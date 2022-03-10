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
<<<<<<< HEAD
		assertEquals(10,new StatementGenerator().TotalCost(1,0));
=======
		assertEquals(10,new StatementGenerator().TotalCost(10,0));
>>>>>>> 9b2312f2bc194cc1fe15a7ee66cf3718f65cae3c
	}
	

}
