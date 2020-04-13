import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SherlockStringValidatorTest {
    @Test
    fun `string is valid when string is only one character`() {
        val string = "a"

        assertEquals("YES", SherlockStringValidator().validate(string))
    }

    @Test
    fun `string is valid when all characters have same frequency`() {
        val string = "aabbc"

//        assertEquals("YES", SherlockStringValidator().validate(string))
    }

    @Test
    fun `string is valid when only one more character is allowed`() {
        val string = "aabbb"

        assertEquals("YES", SherlockStringValidator().validate(string))
    }

    @Test
    fun `string is not valid when difference between most frequent and least frequent char is bigger than 1`() {
        val string = "aabbbbcc"

        assertEquals("NO", SherlockStringValidator().validate(string))
    }

    @Test
    fun `string is not valid when diff between different characters is more than 1`() {
        val string = "aabbcd"
        val stringComplex = "aabbcccddde"

        assertEquals("NO", SherlockStringValidator().validate(string))
        assertEquals("NO", SherlockStringValidator().validate(stringComplex))
    }
}