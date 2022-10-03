package level1;

public class Ex_12918 {
    /*
     문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
     */
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() !=4 && s.length() != 6) return answer = false;
				// 문자열 s 길이가 4 혹은 6이 아니면 false 리턴
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9') return answer = false;
				// s를 charAt으로 비교 후 숫자가 아니면 false 리턴
        }
        return true;
    }
}
