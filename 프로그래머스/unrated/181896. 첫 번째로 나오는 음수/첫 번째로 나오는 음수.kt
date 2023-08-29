class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        for((index,value) in num_list.withIndex()) {
            if(value<0) {
                answer = index
                break
            }
            else {
                answer = -1
            }
        }
        
        return answer
    }
}