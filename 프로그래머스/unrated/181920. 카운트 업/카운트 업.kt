class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for(num in start_num .. end_num) {
            answer.add(num)
        }
        
        return answer.toIntArray()
    }
}