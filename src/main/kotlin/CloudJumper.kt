class CloudJumper {
    fun findShortestPathJumps(c: Array<Int>): Int {
        if (c.size == 0 || (c.size == 1 && c[0] == 0)) return 0

        return if (c.first() == 1) 1 + findShortestPathJumps(c.drop(1).toTypedArray())
        else 1 + findShortestPathJumps(c.drop(2).toTypedArray())
    }

}