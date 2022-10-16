package study.algorithms.programers.level1.이상한문자만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void answerTest() {
        Solution solution = new Solution();
        String try_hello_world = solution.solution("try hello world");
        System.out.println("try_hello_world = " + try_hello_world);
    }

}