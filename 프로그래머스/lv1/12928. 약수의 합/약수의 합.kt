class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        
        for(num in 1..n) {
            if(n%num ==0) answer += num
        }
        
        return answer
    }
}