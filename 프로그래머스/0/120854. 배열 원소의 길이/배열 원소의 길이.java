class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for (int i = 0; i < strlist.length ; i++) {
            answer[i] = strlist[i].split("").length;
        }
        
        
        return answer;
    }
}


// 다른 사람 풀이
import java.util.Arrays;

class Solution {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
