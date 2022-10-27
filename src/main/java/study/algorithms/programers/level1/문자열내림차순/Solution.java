package study.algorithms.programers.level1.문자열내림차순;

public class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int size= chars.length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (chars[j] < chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        for (char ch :chars){
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}
