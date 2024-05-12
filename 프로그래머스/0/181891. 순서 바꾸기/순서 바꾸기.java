class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] temp = new int[n];
        
        int underN = 0;
        int overN = 0;
        
        for (int i = 0; i < num_list.length ; i++ ) {
            if (i+1 <= n) {
                temp[underN] = num_list[i];
                underN++;
            } else {
                answer[overN] = num_list[i];
                overN++;
            }
        }
        
        for (int num : temp) {
            answer[overN] = num;
            overN++;
        }
        
        return answer;
    }
}