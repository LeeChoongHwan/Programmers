class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        
        for(num in i..j) {
            for(n in num.toString()) {
                if(n.toString() == k.toString()) {
                    answer += 1
                }
            }
        }
        
        return answer
    }
}