package level1;

import java.util.HashMap;

public class Ex_42576 {

	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	       
	        HashMap<String,Integer> map = new HashMap<>();
	        // hashMap 생성
	        
	        for(String player : participant){
	            map.put(player,map.getOrDefault(player, 0) + 1);
	        }
	        for(String player : completion){
	            map.put(player,map.get(player)-1);
	            /*
	             map.put을 이용하여 player 선수 key의 value을에 map.getOrDefault를 사용하여 value값을 1로 바꿔준다. 
	             */
	        }
	        
	        for(String key : map.keySet()){
	            if(map.get(key) != 0 ){
	                answer = key;
	                /*
	                keySet을 이용하여 map 에 있는 player의 key값 즉 player이름을 뽑아서 String Key
	                에 넣어주고 get을 이용하여 key의 value 값이 0인지 비교하여 아니면 answer에
	                답 넣어준다
	                */
	            }
	        }
	        
	        return answer;
	    }

}
