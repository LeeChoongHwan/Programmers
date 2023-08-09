class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        
        array.forEach {
            h -> if(h>height) answer++
        }
        
        return answer
    }
}