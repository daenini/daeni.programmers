class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String[] strList = my_string.split("");
        
        for (int i = 0; i < strList.length; i++) {
            if (i == num1) {
                answer += strList[num2];               
            } else if (i == num2) {
                answer += strList[num1];
            } else {
                answer += strList[i];
            }
            
        }
        
        return answer;
    }
}