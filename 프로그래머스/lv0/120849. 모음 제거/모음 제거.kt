class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        
        var my_string2 = my_string.replace("a","")
        my_string2 = my_string2.replace("e","")
        my_string2 = my_string2.replace("o","")
        my_string2 = my_string2.replace("u","")
        my_string2 = my_string2.replace("i","")
        
        return my_string2
    }
}