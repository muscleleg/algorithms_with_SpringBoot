package study.algorithms.programers.level2.롤케이크자르기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
    Solution solution = new Solution();
    int[] topping = {1, 2, 3, 1, 4};
    int answer = solution.solution(topping);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}