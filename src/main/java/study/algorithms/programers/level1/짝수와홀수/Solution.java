package study.algorithms.programers.level1.짝수와홀수;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};

        if (arr.length == 1) return answer;
        answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            min = Math.min(min, i);
        }
        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            if(arr[j]==min) j++;
            answer[i] = arr[j];
            j++;
        }
        return answer;
    }
}
