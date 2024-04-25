import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Sum = Arrays.stream(arr1).sum();
        int arr2Sum = Arrays.stream(arr2).sum();
        
        if (arr1.length != arr2.length) {
            return Integer.compare(arr1.length, arr2.length);
        } else {
            return Integer.compare(arr1Sum, arr2Sum);
        }
    }
}
