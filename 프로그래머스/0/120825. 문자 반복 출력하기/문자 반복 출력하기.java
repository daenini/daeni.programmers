class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] strSplit =  my_string.split("");
        
        for (String i : strSplit)  {
            for (int j = 0; j < n ; j++) {
                answer += i;
            }
        }
        
        return answer;
    }
}