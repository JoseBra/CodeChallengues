class SockMerchant {
    fun countPairs(socketsPool: Array<Int>): Int {
        val countPerSocket = socketsPool.groupingBy { it }.eachCount()
        return countPerSocket.values.fold(0, { foundPairs, numberOfSocks ->
            foundPairs + (numberOfSocks / 2)
        })
    }
}