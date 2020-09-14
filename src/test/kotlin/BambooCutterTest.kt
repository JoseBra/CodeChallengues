import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BambooCutterTest{
    val bambooCutter = BambooCutter()

    @Test
    fun `Example 1`() {
        val bamboos = listOf(5, 4, 4, 2, 2, 8)

        val expected = listOf(6, 4, 2, 1)

        assertEquals(expected, bambooCutter.cutBamboo(bamboos.toTypedArray()).asList())
    }

    @Test
    fun EmptyList() {
        val bamboos = emptyList<Int>()

        val expected = emptyList<Int>()

        assertEquals(expected, bambooCutter.cutBamboo(bamboos.toTypedArray()).asList())
    }
}