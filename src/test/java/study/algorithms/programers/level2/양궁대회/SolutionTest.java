package study.algorithms.programers.level2.양궁대회;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 테스트() {
        Solution solution = new Solution();
        int n = 5;
        int[] info = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] result = {0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0};
        solution.solution(n, info);
    }

}