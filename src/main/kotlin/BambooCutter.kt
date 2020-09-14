class BambooCutter {
    fun cutBamboo(lengths: Array<Int>): Array<Int> {
        var remainingBamboos = lengths.toList()

        val bambooCountAfterRounds = mutableListOf<Int>()
        bambooCountAfterRounds.add(remainingBamboos.size)

        while (remainingBamboos.size > 1) {
            remainingBamboos = remainingBamboos
                .map { it.minus(remainingBamboos.min()!!) }
                .filterNot { it == 0 }
                .toList()
            bambooCountAfterRounds.add(remainingBamboos.size)
        }

        return bambooCountAfterRounds.filterNot { it == 0 }.toTypedArray()
    }
}

//val remainingBamboos = mutableListOf<Int>()
//remainingBamboos.addAll(bamboos)
//
//val bambooCountAfterRounds = emptyList<Int>()
//
//while (remainingBamboos.size != 1) {
//    val (offCuts, remainingBamboosAfterRound) = bamboos.partition { it == remainingBamboos.min() }
//    remainingBamboosAfterRound.forEach { it - offCuts.min()!! }
//
//}