class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] cipherList = cipher.split("");
        
        for (int i = 1; i <= cipher.length(); i++ ) {
            if (i % code == 0) {
                answer += cipherList[i - 1];
            }
        }
        
        return answer;
    }
}