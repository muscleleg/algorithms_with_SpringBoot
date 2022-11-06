package study.algorithms.programers.level2.택배상자;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        int[] orders ={2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        Solution solution = new Solution();
        int answer= solution.solution(orders);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}