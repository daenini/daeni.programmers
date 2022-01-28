package level1;


/*
 url: https://programmers.co.kr/learn/courses/30/lessons/12935
 
 제일 작은 수 제거하기
 
 < 문제 >
 
 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 
 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
 [10]면 [-1]을 리턴 합니다.
 */


public class Ex_12935 {
public int[] solution(int[] arr) {
        
        if(arr.length <= 1){
          int[] answer= {-1};
            return answer;
        }
        
        int min = arr[0]; //우선 첫번째 숫자 넣어주기
        for(int i = 0 ; i< arr.length; i++){
            min = Math.min(min,arr[i]);
            // min 값이랑 arr[i]을 비교해서 작은것을 min에 넣어주기
        }
        int[] answer = new int[arr.length-1];
        int index = 0; //answer index를 따로 주기위함
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==min){
                continue;
                // arr[i]가 min이랑 같으면 continue를 사용해서 다시 for문으로 돌아가기
            }
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
}
