package study.algorithms.programers.level1.핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int phoneLen = phone_number.length();
        int showLen = 4;
        int hideLen = (phoneLen - 1) - showLen;
        for (int i = 0; i <phoneLen ; i++) {
            if(i <= hideLen) answer+="*";
            else answer += phone_number.charAt(i);
        }
        return answer;
    }
    //위의 코드에 비해 속도 10배 빠름
    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
