class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        
        for(word in s1) {
            for(word2 in s2) {
                if(word.equals(word2)) {
                    answer ++
                }
            }
        }
        
        return answer
    }
}