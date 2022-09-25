package study.algorithms.programers.level1.예산;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = 0;
        Arrays.sort(d);
        for (int i : d) {
            money += i;
            if (money > budget) {
                return answer;
            }
            answer++;
        }
        return answer;
    }
}
