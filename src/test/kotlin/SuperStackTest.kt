import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SuperStackTest {

    val stack = SuperStack()

    @Test
    fun `it should add element to the stack and print top of it`() {
        stack.superStack(
            listOf(
                "push 4",
                "pop",
                "push 3",
                "push 5",
                "push 2",
                "inc 3 1",
                "pop",
                "push 1",
                "inc 2 2",
                "push 4",
                "pop",
                "pop"
            ).toTypedArray()
        )
    }
}