class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i : num_list) {
            if(i%2==0) {
                odd += Integer.toString(i);
            }
            else {
                even += Integer.toString(i);
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}