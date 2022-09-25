package study.algorithms.programers.level1.다트게임;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int solution1 = solution.solution("1S2D*3T");
        Assertions.assertThat(solution1).isEqualTo(37);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution.solution("1D2S#10S");
        Assertions.assertThat(solution2).isEqualTo(9);
        System.out.println("solution2 = " + solution2);
    }
}