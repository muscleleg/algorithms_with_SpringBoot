package study.algorithms.programers.level1.두정수사이의합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i = min; i <= max; i++){
            answer += i;
        }
        return answer;
    }
}
