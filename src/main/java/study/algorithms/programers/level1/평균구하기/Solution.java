package study.algorithms.programers.level1.평균구하기;

public class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        answer/=arr.length;
        return answer;
    }
}
