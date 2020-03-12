import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SockMerchantTest {
    private val merchant = SockMerchant()

    @Test
    fun `it should count sock pairs`() {
        val socketsPool = arrayOf(1, 2, 1, 2, 1, 3, 2)

        assertEquals(2, merchant.countPairs(socketsPool))
    }
}