package study.algorithms.programers.level1.문자열정수로바꾸기;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();
        int size = chars.length;
        int sign = 1;
        int start = 0;
        if (chars[0] == '-') {
            start=1;
            sign=-1;
        }
        if (chars[0] == '+') {
            start=1;
            sign=1;
        }
        for (int i = start; i < size; i++) {
            answer += Character.getNumericValue(chars[i]) * Math.pow(10, (size-1) - i);
        }
        return answer*sign;
    }
}
