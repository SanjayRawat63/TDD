package co.inteleap.course;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementGenereatorTest {

	@Test
	public void shouldCalculateCostForAGivenTime() {
		assertEquals(1,new StatementGenerator().TotalFare(0,1));
	}

}
