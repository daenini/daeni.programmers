package level1;

public class Ex_12926 {
	/*
	 시저암호
	 
	 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
	 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
	 "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수,
	 solution을 완성해 보세요.
	 */
	public String solution(String s, int n) {
		String answer = "";
		for(int i = 0; i < s.length(); i++) {
			char alph = s.charAt(i);
			// if alph 소문자
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
