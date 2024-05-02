class Solution {
    public int solution(String s) {
        
        String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<list.length; i++){
            s = s.replace(list[i], Integer.toString(i));
        }
        
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}