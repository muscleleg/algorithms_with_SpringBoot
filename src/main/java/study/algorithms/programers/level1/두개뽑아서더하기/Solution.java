package study.algorithms.programers.level1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> removeDuplicate = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                removeDuplicate.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[removeDuplicate.size()];

        ArrayList<Integer> tmp = new ArrayList<>(removeDuplicate);
        Collections.sort(tmp);
        for (int i = 0; i < removeDuplicate.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2,1,3,4,1};
        solution.solution(numbers);
    }
}
