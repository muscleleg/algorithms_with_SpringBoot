package study.algorithms.programers.level1.비밀지도;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void answer() {
        Solution solution = new Solution();
        int n = 5;
        int[] arr1	= {9, 20, 28, 18, 11};
        int[] arr2	= {30, 1, 21, 17, 28};
        String[] answer = solution.solution(5, arr1, arr2);
        String[] expectedAnswer = {"#####","# # #", "### #", "#  ##", "#####"};
        Assertions.assertThat(answer).isEqualTo(expectedAnswer);
    }


}