package study.algorithms.programers.level1.서울에서김서방찾기;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                return "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
