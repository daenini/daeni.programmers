package level1;

import java.util.ArrayList;
import java.util.Arrays;

/*
  
 < 문제 >
 array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요. 
*/

public class Ex_12910 {
	 public int[] solution(int[] arr, int divisor) {
	        int[] answer = {};
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        
	        for(int i = 0; i< arr.length; i++){
	            if(arr[i] % divisor == 0){
	                arrList.add(arr[i]);
	            }
	        }

	        if(arrList.size() == 0){
	            arrList.add(-1);
	        }
	        
	        answer = new int[arrList.size()];
	        
	        for(int i = 0 ; i< answer.length; i++){
	            answer[i] = arrList.get(i);
	        }
	        Arrays.sort(answer);
	        
	        return answer;
	    }
}
