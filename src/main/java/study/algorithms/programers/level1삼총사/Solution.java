package study.algorithms.programers.level1삼총사;

public class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int size = number.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    answer += (number[i] + number[j] + number[k] == 0) ? 1 : 0;
                }
            }
        }
        return answer;
    }

}
