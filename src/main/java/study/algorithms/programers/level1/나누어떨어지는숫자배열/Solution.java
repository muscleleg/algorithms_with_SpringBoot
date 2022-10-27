package study.algorithms.programers.level1.나누어떨어지는숫자배열;

import java.util.ArrayList;

import java.util.Collections;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> ansList = new ArrayList<>();
        for (int i : arr){if (i % divisor == 0) ansList.add(i);}

        if(ansList.size()==0) return new int[]{-1};
        Collections.sort(ansList);
        answer = ansList.stream().mapToInt(i->i).toArray();

        return answer;
    }
}
