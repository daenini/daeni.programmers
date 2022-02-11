package level1;


/*
 	자릿수 더하기
 	
 	< 문제 > 
 	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 
 */
public class Ex_12931 {
	 public int solution(int n) {
	        int answer = 0;

	        while(n>0){
	            answer += n%10;
	            n = n/10;
	            /* 
		          n이 만약 129면
		          129%10 은 9 answer += 9 그리고 129/10 하면 n = 12
		          12%10 은 2 answer += 11 그리고 12/10 하면 n = 1
		          1 % 10 하면 1 answer += 12 그리고 while문 나가기
		        	 
	             */
	        }

	        return answer;
	    }
}
