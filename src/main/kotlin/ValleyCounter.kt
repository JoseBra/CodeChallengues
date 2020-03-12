class ValleyCounter {
    fun countValleys(hike: String): Int {
        var foundValleys = 0
        var seaLevel = 0

        hike.forEach { nextStep ->
            if (seaLevel == 0 && nextStep == 'D') foundValleys++
            when (nextStep) {
                'D' -> seaLevel--
                'U' -> seaLevel++
                else -> seaLevel
            }
        }

        return foundValleys
    }
}