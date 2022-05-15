package level1;

public class Ex_12932 {
	/*
	 < 문제 >
	 
	 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
	 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	 */
	public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        
        int cnt = 0; // answer index 카운트
        while (n > 0) {
            // 나머지는 맨 뒷자리 숫자
            // ex)  123%10 = 3
            //      12%10  = 2
            //      1%10   = 1
            answer[cnt] = (int) (n % 10);
            // 123 = 12
            // 12 = 1
            // 1 = 0 ( 0.1 )
            n /= 10;
            cnt++;
        }      
        return answer;
    }
}
