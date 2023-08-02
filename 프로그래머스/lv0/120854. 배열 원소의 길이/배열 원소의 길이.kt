class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        
        for(word in strlist) {
            answer.add(word.length)
        }
        
        return answer.toIntArray()
    }
}