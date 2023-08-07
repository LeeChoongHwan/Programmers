class Solution {
    fun solution(numbers: IntArray): Int { 
        val numberToReverse = numbers.sorted().reversed()
        val answer = numberToReverse[0]*numberToReverse[1]
        return answer
    }
}