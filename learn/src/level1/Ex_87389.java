package level1;

public class Ex_87389 {
    public int solution(int n) {
        int answer = 0;
        for(int x = 2; x < n; x++){
            if(n%x == 1){
                answer = x;
                break;
            }
        }
        return answer;
    }
    // 또는

    public int solution2(int n){
        int answer = 0;
        while(true){
            if(n % answer == 1)break;
            answer ++;
        }
        return answer;
    }
}
