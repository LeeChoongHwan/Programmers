class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        if(num_list.size>=11) {
            for(num in num_list) {
                answer += num
            }
        }
        else {
            answer = 1
            for(num in num_list) {
                answer *= num
            }
        }
        
        return answer
    }
}