class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nSplit = (n+"").split("");
        
        for (String str : nSplit) {
            int i = Integer.parseInt(str);
            answer += i;
        }
        
        return answer;
    }
}