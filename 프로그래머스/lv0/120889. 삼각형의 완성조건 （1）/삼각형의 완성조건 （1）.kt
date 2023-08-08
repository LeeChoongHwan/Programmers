class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        
        var sidesReversed = sides.sorted().reversed()
        
        if(sidesReversed[0]<sidesReversed[1]+sidesReversed[2]) return 1
        else return 2
    
    }
}