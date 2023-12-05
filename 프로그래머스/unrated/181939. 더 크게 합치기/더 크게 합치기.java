class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String answerToStringA = "";
        String answerToStringB = "";
        
        answerToStringA = Integer.toString(a) + Integer.toString(b);
        answerToStringB = Integer.toString(b) + Integer.toString(a);
        
        int answerA = Integer.parseInt(answerToStringA);
        int answerB = Integer.parseInt(answerToStringB);
        
        if(answerA > answerB) {
            return answerA;
        }
        else {
            return answerB;
        }
        
    }
}