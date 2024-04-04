class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] rspList = rsp.split("");
        for (String str : rspList) {
            switch (str) {
                case "2" :
                    answer += "0";
                    continue;
                case "0" : 
                    answer += "5";
                    continue;
                case "5" : 
                    answer += "2";
                    continue;
            }
        }
        
        return answer;
    }
}