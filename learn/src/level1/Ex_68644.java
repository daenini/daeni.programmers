package level1;

import java.util.*;

public class Ex_68644 {
	public int[] solution(int[] numbers) {
        ArrayList<Integer> plusList = new ArrayList<Integer>();
        
        for(int i = 0; i<numbers.length-1 ;i++){
            for(int j = i+1; j< numbers.length; j++){
                int plus = numbers[i]+numbers[j];
                if(!plusList.contains(plus)){
                	/* 
                	 contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
                		반환을 있으면 true 없으면 false로 반환한다.
                	*/
                    plusList.add(plus);
                }
            }
        }
        int[] answer = new int[plusList.size()];
        for(int i = 0; i< plusList.size(); i++){
            answer[i] = plusList.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
