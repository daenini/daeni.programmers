class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int mult = 1;
        int sum = 0;
        
        for (int num : num_list ) {
            mult *= num;
            sum += num;
        }
        
        answer = mult < sum*sum ? 1:0;
        
        return answer;
    }
}