class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        
        String[] myStringList = my_string.split("");
        String[] isPrefixList = is_prefix.split("");
        
        if (my_string.length() > is_prefix.length()) {
            for (int i = 0; i < is_prefix.length(); i ++) {
                if (!isPrefixList[i].equals(myStringList[i])) {
                    answer = 0;
                    break;
                }
            }
        } else {
            answer = 0;
        }
        
        return answer;
    }
}


// 다른사람 풀이
/*
// String.startsWith 사용
class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;
    }
}

// Stream 사용
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String myString, String isPrefix) {
        return IntStream.rangeClosed(0, myString.length())
            .mapToObj(i -> myString.substring(0, i))
            .anyMatch(s -> s.equals(isPrefix)) ? 1 : 0;
    }
}
*/
