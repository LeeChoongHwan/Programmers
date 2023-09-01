class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for(num in arr) {
            if(num>=50 && num%2==0) {
                answer.add(num/2)
            }
            else if(num<50 && num%2==1) {
                answer.add(num*2)
            }
            else answer.add(num)
        }
        
        return answer.toIntArray()
    }
}