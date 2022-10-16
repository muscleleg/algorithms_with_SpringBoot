package study.algorithms.programers.level1.숫자짝꿍_중요;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    void Test() {
        Solution solution = new Solution();
        String answer = solution.solution2("5525", "1255");
        assertThat(answer).isEqualTo("-1");
    }

}