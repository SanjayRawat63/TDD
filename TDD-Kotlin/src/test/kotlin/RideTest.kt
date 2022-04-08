import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RideTest {
    @Test
    fun shouldCalculateForAGivenTime(){
        val ride=Ride(1.0,0.0)
        assertEquals(1.0,ride.Fare())
    }
    @Test
    fun shouldCalculateForAGivenTimeAndForAGivenDistance(){
        val ride=Ride(1.0,1.0)
        assertEquals(11.0,ride.Fare())
    }
}