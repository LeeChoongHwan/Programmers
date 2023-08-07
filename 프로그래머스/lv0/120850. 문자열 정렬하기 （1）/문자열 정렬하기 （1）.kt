class Solution {
    fun solution(my_string: String): IntArray {
        var answer = mutableListOf<Int>()
        for(char in my_string) {
            if(char.isDigit()) answer.add(char.toString().toInt())
        }
        
        return answer.sorted().toIntArray()
        
    }
}