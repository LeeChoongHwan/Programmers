class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        
        for (char in my_string) {
            if(char.isDigit()) {
                answer += char.toString().toInt()
            }
        }
        
        return answer
    }
}