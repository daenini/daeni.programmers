class Solution {
    public String solution(int age) {

        
        StringBuilder sb = new StringBuilder();
        
        while (age > 0) {
            int num = age % 10;
            char charAge = (char) (num + 'a');
            sb.insert(0,charAge);
            age /= 10;
        }
        
        return sb.toString();
    }
}