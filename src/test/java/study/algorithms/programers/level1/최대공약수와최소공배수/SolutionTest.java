package study.algorithms.programers.level1.최대공약수와최소공배수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void answerTest() {
        Solution solution = new Solution();
        int[] answer = solution.solution(2, 5);
        int[] expect = {1,10};
        Assertions.assertThat(answer).isEqualTo(expect);
    }
}