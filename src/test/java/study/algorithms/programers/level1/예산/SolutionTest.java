package study.algorithms.programers.level1.예산;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int[] d1 = {1, 3, 2, 5, 4};
        int solution1 = solution.solution(d1, 9);
        Assertions.assertThat(solution1).isEqualTo(3);


    }
}