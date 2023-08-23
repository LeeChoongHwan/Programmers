class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        
        for((index, value) in absolutes.withIndex()) {
            if(signs[index] == true) answer += value
            else answer -= value
        }
        
        return answer
    }
}