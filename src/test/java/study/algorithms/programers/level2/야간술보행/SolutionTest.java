package study.algorithms.programers.level2.야간술보행;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        int distance = 10;
        int[][] scope ={{3, 4}, {5, 8}};
        int[][] times ={{2,5},{4,3}};

        Assertions.assertThat(solution.solution(distance,scope,times)).isEqualTo(9);
    }
}