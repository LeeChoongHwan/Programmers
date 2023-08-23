class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        
        var beforeToArray = before.toCharArray().sorted()
        var afterToArray = after.toCharArray().sorted()
        
        if(beforeToArray.equals(afterToArray)) return 1
        else return 0
        
        return answer
    }
}