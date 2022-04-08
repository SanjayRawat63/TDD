import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatementGeneratorTest {
    @Test
    fun shouldCaclculateFareForGivenTime() {
        val statementGenerator = StatementGenerator()
        assertEquals(1.0, statementGenerator.totalFare(1.0, 0.0))
    }

    @Test
    fun shouldCaclculateFareForGivenTimeAndGivenDistance() {
        val statementGenerator = StatementGenerator()
        assertEquals(11.0, statementGenerator.totalFare(1.0, 1.0))
    }
    @Test
    fun shouldCalcualteFareForMultipleRide(){
        val statementGenerator=StatementGenerator()
        val listOfRide= listOf(Ride(1.0,1.0),Ride(2.0,10.0))
        assertEquals(113.0,statementGenerator.totalFare(listOfRide))
    }
}