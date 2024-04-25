class Solution {
    public String solution(String myString) {
        String answer = "";
        
        String[] myStringList = myString.split("");
        
        for (String str : myStringList) {
            answer += "a".equals(str) ? str.toUpperCase() : "A".equals(str) ? str : str.toLowerCase();
        }
        
        return answer;
    }
}