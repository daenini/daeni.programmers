class Solution {
    public int solution(int n, String control) {
         int answer = n;
        String[] controlList = control.split("");
        
        for(int i = 0; i < controlList.length; i++){
            if("w".equals(controlList[i])){
                answer += 1;
            } else if("s".equals(controlList[i])){
                answer -= 1;
            } else if("d".equals(controlList[i])){
                answer += 10;
            } else if("a".equals(controlList[i])){
                answer -= 10;
            }
        }
        return answer;
    }
}