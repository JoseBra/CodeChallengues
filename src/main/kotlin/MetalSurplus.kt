class MetalSurplus {
    fun maxProfit(costPerCut: Int, salePrice: Int, lengths: Array<Int>): Int {
        if (lengths.size == 0 ) return 0
        val rods = lengths.asList()
        val profitPossibilities = mutableListOf<Int>()

        for( cutLength in 1..rods.max()!!){
            var neededCuts = 0
            var salableUnits = 0
            var nonSalableUnits = 0

            rods.forEach { rod ->
                salableUnits += rod

                if ( rod.rem(cutLength) == 0) {
                    neededCuts += rod / cutLength - 1
                } else {
                    neededCuts += rod / cutLength
                }

                nonSalableUnits += rod.rem(cutLength)
            }


            val profitWithTheseCuts = (salableUnits - nonSalableUnits) * salePrice - neededCuts * costPerCut
            profitPossibilities.add(profitWithTheseCuts)
        }

        return profitPossibilities.max()!!
    }
}