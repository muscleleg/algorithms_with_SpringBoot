package study.algorithms.programers.level1.k번째수;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] sliceArr = Arrays.copyOfRange(array, (commands[i][0]-1),(commands[i][1]));
            Arrays.sort(sliceArr);
            int numAt= commands[i][2]-1;
            answer[i] = sliceArr[numAt];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution S = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        S.solution(array, commands);
    }
}
