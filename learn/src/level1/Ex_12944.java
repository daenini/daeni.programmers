package level1;

/*
 
 url: https://programmers.co.kr/learn/courses/30/lessons/12944
 
 평균구하기
 
 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 
 */

public class Ex_12944 {
	
	 public double solution(int[] arr) {
	        double answer = 0;
	        
	        int sum = 0;
	        
	        for(int i = 0;i<arr.length;i++ ){
	            sum += arr[i];
	        }
	        answer = (double)sum/arr.length;
	        // (double)로 캐스팅을 안해주면 정수만 나오기 때문에 소숫점 자리까지 구하려면 double로 캐스팅 해줘야됨
	        
	        return answer;
	    }
	
}
