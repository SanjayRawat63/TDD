import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatementGeneratorTest {
    @Test
    fun shouldCaclculateFareForGivenTime() {
        val statementGenerator = StatementGenerator()
        assertEquals(1.0, statementGenerator.totalFare(1.0,0.0))
    }
    @Test
    fun shouldCaclculateFareForGivenTimeAndGivenDistance() {
        val statementGenerator = StatementGenerator()
        assertEquals(11.0, statementGenerator.totalFare(1.0,1.0))
    }
}