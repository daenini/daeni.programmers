import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer =  Arrays.stream(my_string.split(""))
                .filter(str -> !"aeiou".contains(str)) 
                .collect(Collectors.joining()); 
        
        return answer;
    }
}