package study.algorithms.programers.level1.콜라츠추측;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.algorithms.programers.level1.콜라츠추측.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void answerTest() {
        Solution solution = new Solution();
        int answer = solution.solution(1);
        Assertions.assertThat(answer).isEqualTo(0);
    }

}