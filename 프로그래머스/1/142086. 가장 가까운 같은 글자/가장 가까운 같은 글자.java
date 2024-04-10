class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1;
        String[] sArr = s.split("");
        
        for (int i = 1 ; i <= s.length()-1 ; i++) {
            String temp = s.substring(0,i);
            
            answer[i] = temp.contains(sArr[i]) ? i - temp.lastIndexOf(sArr[i]) : -1;
        }
        
        return answer;
    }
}