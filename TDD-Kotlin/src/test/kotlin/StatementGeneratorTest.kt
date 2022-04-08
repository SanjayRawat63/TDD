import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatementGeneratorTest {
    @Test
    fun shouldCaclculateFareForGivenTime() {
        val statementGenerator = StatementGenerator()
        assertEquals(1.0, statementGenerator.totalFare(1.0))
    }

}