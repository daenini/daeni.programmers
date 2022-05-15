package level1;

import java.util.ArrayList;
/*
 같은 숫자는 싫어
 
 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
 arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 */
public class Ex_12906 {
	public int[] solution(int []arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int num = 10; // arr에는 1~9 까지 들어가니까 첫번째를 비교하기 위해 선언
        for(int i=0; i<arr.length; i++) {
        	if(num != arr[i]) {
        		// 현재 돌고있는 숫자와 전에 숫자와 다르면 if문 들어감
        		temp.add(arr[i]); // 다르기 때문에 temp에 넣어줌
        		num = arr[i]; // 다음 숫자와 비교하기 위해 변경
        	}
        }
        int[] answer = new int[temp.size()]; //answer 선언
        for(int i = 0; i<temp.size(); i++) {
        	answer[i] = temp.get(i);
        }
            return answer;
        }

}
