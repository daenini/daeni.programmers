class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] strList = myString.split("");
        String replaceMyString = "";
        
        for (String str : strList) {
            replaceMyString += "A".equals(str) ? "B" : "A";
        }
        
        answer = replaceMyString.indexOf(pat) == -1 ? 0 : 1;
        
        return answer;
    }
}