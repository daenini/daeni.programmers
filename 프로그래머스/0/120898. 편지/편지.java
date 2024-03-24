class Solution {
    public int solution(String message) {
        int answer = 0;
        
        String[] msgArr = message.split("");
        
        answer = msgArr.length*2;
        
        return answer;
    }
}