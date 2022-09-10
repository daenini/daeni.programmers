package level1;

public class Ex_86051 {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 45;
        for(int n : numbers){
            sum -= n;
        }
        answer = sum;
        return answer;
    }
}
