class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        var odd : Int = 0
        var even : Int = 0
        
        for(num in num_list.indices) {
            if(num%2 == 1) {
                odd += num_list[num]
            }
            else {
                even += num_list[num]
            }
        }
        
        if(odd>even) return odd
        else return even 
    }
}