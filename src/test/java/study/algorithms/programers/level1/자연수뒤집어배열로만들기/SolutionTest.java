package study.algorithms.programers.level1.자연수뒤집어배열로만들기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {
    @Test
    void answerTest() {
        Solution solution = new Solution();
        int[] n = {5, 4, 3, 2, 1};
        int[] answer = solution.solution(12345);
        Assertions.assertThat(answer).isEqualTo(n);
    }
}