class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for(num in 1..n) {
            if(n%num == 0) {
                answer.add(num)
            }
        }
        
        return answer.toIntArray()
    }
}