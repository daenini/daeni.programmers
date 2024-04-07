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