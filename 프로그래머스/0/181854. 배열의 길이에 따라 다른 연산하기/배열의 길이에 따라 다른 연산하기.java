class Solution {
    public int[] solution(int[] arr, int n) {
        int arrLength = arr.length;
        int[] answer = new int[arrLength];
        
        for (int i = 0; i < arr.length; i++) {
            if (arrLength % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else if (arrLength % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}