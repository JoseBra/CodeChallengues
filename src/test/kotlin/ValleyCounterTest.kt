import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValleyCounterTest {

    val valleyCounter = ValleyCounter()

    @Test
    fun `it should count valleys in hike`() {
        val hike = "UDDDUDUU"

        assertEquals(1, valleyCounter.countValleys(hike))

    }
}
