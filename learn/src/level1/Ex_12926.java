package level1;

public class Ex_12926 {
	public String solution(String s, int n) {
		String answer = "";
		for(int i = 0; i < s.length(); i++) {
			char alph = s.charAt(i);
			if(alph >= 'a' && alph <='z') {
				alph = (char)(alph+n);
				if(alph > 'z') {
					answer += (char)(alph-26);
				}else {
					answer += alph;
				} 
			} // if alph 소문자 끝
			else if(alph >='A' && alph <='Z') {
				alph = (char)(alph+n);
				if(alph >'Z') {
					answer += (char)(alph-26);
				}else {
					answer += alph;
				}
			}//else if alph 대문자 끝
			else {
				answer += (char)alph;
			} // if alph가 스페이스 끝
		}
		return answer;
	}

}
