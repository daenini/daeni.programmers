package level1;

import java.util.Arrays;

public class Ex_12982 {
	 public int solution(int[] d, int budget) {
	        int answer = 0;
	        int plus = 0;
	         
	        Arrays.sort(d);
	        for(int i = 0; i< d.length; i++){
	            if(d[i] <= budget){
	                budget-= d[i];
	                answer ++;
	            }
	            else{
	                break;
	            }
	        }
	        
	        
	        return answer;
	    }
}
