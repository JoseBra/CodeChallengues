import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MetalSurplusTest{
    @Test
    fun `basic example`() {
        val rods = listOf(26, 103, 59)
        val expectedProfit = 1770

        assertEquals(expectedProfit, MetalSurplus().maxProfit(1, 10, rods.toTypedArray()))
    }

    @Test
    fun `no rods to sell`() {
        val rods = emptyList<Int>()
        val expectedProfit = 0

        assertEquals(expectedProfit, MetalSurplus().maxProfit(1, 10, rods.toTypedArray()))

    }

    @Test
    fun `example 2`() {
        val rods = listOf(10, 10, 10, 10, 10, 10, 10, 10, 100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
        val expectedProfit = 310 * 10 - 9 * 120


        assertEquals(expectedProfit, MetalSurplus().maxProfit(120, 10, rods.toTypedArray()))
    }
}