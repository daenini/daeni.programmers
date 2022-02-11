package level1;

import java.util.Arrays;

/*
  
  정수 내림차순으로 배치하기
 
  < 문제 > 
  함수 solution은 정수 n을 매개변수로 입력받습니다.
  n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
  예를들어 n이 118372면 873211을 리턴하면 됩니다.
  
 */
public class Ex_12933 {
	public long solution(long n) {
        long answer = 0;
        String[] arrN =(n+"").split("");
        // long n을 String으로 바꾸기 위해 +""하고 split로 문자마다 잘라서 arrN에 넣어줌
        Arrays.sort(arrN);
        // arrN을 오름차순 으로 바꾼다
        String strN = "";
        // 오름차순한 arrN을 내림차순으로 바꿔준담에 넣어줄 strN 생성
        for(int i = arrN.length-1; i>=0; i--){
        	// for문을 거꾸로 해서 넣어준다
            strN+=arrN[i];
        }
        answer = Long.parseLong(strN);
        // String타입의 strN을 long타입으로 바꿔준다
        
        
        return answer;
    }
}
