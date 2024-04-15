import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] letterList = letter.split(" ");
        String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, String> map = new HashMap<String, String>();
        
        char lower = 'a';
        for(String str : morse) {
            map.put(str, lower+"");
            lower++;
        }
        
        for (String str : letterList) {
            answer += map.get(str);
        }
        
        return answer;
    }
}