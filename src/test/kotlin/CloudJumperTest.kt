import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CloudJumperTest {

    val cloudJumper = CloudJumper()

    @Test
    fun `it should return minimum amount of jumps needed`() {
        val cloudPath = arrayOf(
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            1,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            0,
            1,
            0,
            1,
            0
        )

        assertEquals(46, cloudJumper.findShortestPathJumps(cloudPath))
    }
}