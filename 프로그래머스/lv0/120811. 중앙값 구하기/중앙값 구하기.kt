class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var arraySorted = array.sorted()
        answer = arraySorted[array.size/2]
        return answer
    }
}