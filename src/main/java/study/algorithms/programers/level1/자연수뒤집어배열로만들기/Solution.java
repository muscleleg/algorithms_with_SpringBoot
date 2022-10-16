package study.algorithms.programers.level1.자연수뒤집어배열로만들기;

import java.util.Arrays;

public class Solution {
    public int[] solution(long n) {

        String s = String.valueOf(n);
        int size = s.length();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = (int) (n % 10);
            n/=10;
        }
        return answer;
    }
}
