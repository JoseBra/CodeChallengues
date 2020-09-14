import java.awt.print.Printable

class SuperStack {

    fun superStack(operations: Array<String>) {
        val stack = mutableListOf<Int>()
        var linesToPrint = ""

        operations.forEach { operation ->
            when {
                operation.contains("push") ->
                    addToStack(stack, operation.split(" ").last().toInt())
                operation.contains("pop") ->
                    stack.removeAt(stack.lastIndex)
                operation.contains("inc") ->
                    sumToElements(stack, operation.split(" ").last().toInt(), operation.split(" ")[1].toInt())
            }
            linesToPrint += printableLine(stack) + "\n"
        }

        println(linesToPrint)
    }

    private fun sumToElements(stack: MutableList<Int>, amount: Int, numberOfElements: Int) {
        stack.take(numberOfElements).forEachIndexed {
                index, element ->
            stack[index] = element + amount
        }
    }

    private fun printableLine(stack: MutableList<Int>): String {
        if (stack.isEmpty()) {
            return "EMPTY"
        } else {
           return stack.last().toString()
        }
    }

    private fun addToStack(stack: MutableList<Int>, number: Int) {
        stack.add(number)
    }

}