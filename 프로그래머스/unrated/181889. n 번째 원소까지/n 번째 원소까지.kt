class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for(n in 0..n-1) {
            answer.add(num_list[n])
        }
        
        return answer.toIntArray()
    }
}