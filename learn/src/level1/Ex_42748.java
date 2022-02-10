package level1;

import java.util.Arrays;

public class Ex_42748 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i = 0; i< commands.length; i++){
            int first = commands[i][0];
            // 자르기 시작하는 부분
            int end = commands[i][1];
            // 자르기 끝나는 부분
            int select = commands[i][2];
            // 원하는 결과값
            int[] selectArr = new int[end - first + 1];
            // 자른 값들 담아주는 selectArr
            int selectArrIndex = 0;
            // 자른 값 배열 index 에다가 array값을 넣을때 필요
                for(int j = first-1; j < end; j++){
                	//j == 시작하는 값-1 (배열 index는 0부터 시작하니까)
                    selectArr[selectArrIndex] = array[j];
                    // selectArr에 0번 부터 arry 자르기 시작하는 값 넣기
                    selectArrIndex++;
                }
            Arrays.sort(selectArr);
            // selectArr정렬
            answer[i] = selectArr[select-1];
            // answer에 selectArr에 담겨진 값들에서 정답 찾아서 넣기
            
            
        }

        return answer;
    }
}
