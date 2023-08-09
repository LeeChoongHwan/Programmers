class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for(num in 1..n) {
            if(n%num == 0) {
                answer ++
            }
        }
        
        return answer
    }
}