package level1;

import java.util.Arrays;

public class Ex_42747 {
	 public int solution(int[] citations) {
	        int answer = 0;
	        // h번 이상 인용된 논문이 h편 이상이고 나머지가 h번 이하인 h의 최댓값 구하기
	      
	        Arrays.sort(citations);
	        for(int i = 0; i<citations.length; i++){
	            int h = citations.length-i;
	            if(citations[i]>=h) {
	                answer = h;
	                break;
	            }
	        }
	        
	        return answer;
	    }
}
