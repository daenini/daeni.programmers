package level1;
/*
 
 정수 제곱근 판별
 
 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요. 
 */
public class Ex_12934 {
	
	public long solution(long n) {
        long answer = 0;
        
        double x = Math.sqrt(n);
        // Math.sqrt는 double로 반환하기 때문에 double로 선언
        if(x%1 == 0){
        /*
       	 정수는 1로 나누면 0으로 나누어 떨어짐
         아니면 x를 다시 제곱하고 n이랑 비교
         */
           answer = (long)Math.pow(x+1, 2);
           // answer = (long)((x+1)*(x+1));
        }else{
            answer = -1;
        }
        
        return answer;
    }

}
