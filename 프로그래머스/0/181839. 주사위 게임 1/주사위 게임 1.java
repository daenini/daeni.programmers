class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean oddA = a % 2 !=0 ? true : false;
        boolean oddB = b % 2 !=0 ? true : false;
        
        if (oddA && oddB) {
            answer = (a*a)+ (b*b);
        } else if (oddA || oddB) {
            answer = 2*(a+b);
        } else {
            answer = Math.abs(a-b);
        }
        
        
        
        return answer;
    }
}