class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        var multiply = 1
        var sum = 0
        
        for(i in num_list) {
            multiply *= i
        }
        
        for(i in num_list) {
            sum += i
        }
        
        sum = sum*sum
        
        if(sum>multiply) answer = 1
        else answer = 0
        
        
        
        return answer
    }
}