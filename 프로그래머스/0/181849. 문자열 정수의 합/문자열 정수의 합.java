class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] numList = num_str.split("");
        
        for (String str : numList) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}