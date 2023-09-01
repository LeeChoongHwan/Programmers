class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        
        for(word in str_list) {
            if(!word.contains(ex)) {
                answer+=word
            }
        }
        
        return answer
    }
}