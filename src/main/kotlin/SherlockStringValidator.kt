class SherlockStringValidator {
    fun validate(string: String): String {
        val lettersCount = string.groupingBy { it }.eachCount()
        val outlayerCharCounts = lettersCount.filter { it.value != lettersCount.values.min() }
        return when {
            lettersCount.size == 1 -> "YES"
            outlayerCharCounts.size > 1 -> "NO"
            outlayerCharCounts.values.first() - lettersCount.values.min()!! > 1 -> "NO"
            else -> "YES"
        }
    }
}