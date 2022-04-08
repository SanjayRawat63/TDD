import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatementGeneratorTest {
    @Test
    fun shouldCalcualteFareForMultipleRide(){
        val listOfRide= listOf(Ride(1.0,1.0),Ride(2.0,10.0))
        val statementGenerator=StatementGenerator(listOfRide)
        assertEquals(113.0,statementGenerator.totalFare())
        assertEquals(2,statementGenerator.getNoOfRides())
        assertEquals(56.5,statementGenerator.getAvgFarePerRide())
    }
}