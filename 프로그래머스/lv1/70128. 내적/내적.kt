class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        
        for(num in 0..a.size-1) {
            answer += a[num]*b[num]
        }
        
        return answer
    }
}