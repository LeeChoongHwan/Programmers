class Solution {
    fun solution(x: Int, n: Int): LongArray {
        return Array<Long>(n){i -> (x.toLong() * (i + 1))}.toLongArray()
    }
}