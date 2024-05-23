class Solution {
    public String[] solution(String[] strArr) {
        
        int length = 0;
        for (String str : strArr) {
            if (str.indexOf("ad") == -1) {
                length++;
            }
        }
        
        String[] answer = new String[length];
        
        int idx = 0;
        for (String str : strArr) {
            if (str.indexOf("ad") == -1) {
                answer[idx++] = str;
            }
        }
        return answer;
    }
}