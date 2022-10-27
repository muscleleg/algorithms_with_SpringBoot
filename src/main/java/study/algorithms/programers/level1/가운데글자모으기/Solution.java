package study.algorithms.programers.level1.가운데글자모으기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int center = (int)(Math.ceil((float)s.length() / 2)) - 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(center));
        if(s.length() % 2 == 0){sb.append(s.charAt(center+1));}
        answer = sb.toString();
        return answer;
    }
}
