package study.algorithms.programers.level1.신고결과받기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.algorithms.programers.level1.신고결과받기.Solution;


class SolutionTest {
    @Test
    public void answerTest(){
        Solution s = new Solution();

        String[] id_list1={"muzi", "frodo", "apeach", "neo"};
        String[] report1={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k1 = 2;
        int[] result1 ={2,1,1,0};
        Assertions.assertThat(s.solution2(id_list1, report1, k1)).isEqualTo(result1);

        String[] id_list2={"con", "ryan"};
        String[] report2={"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        int[] result2 ={0,0};
        Assertions.assertThat(s.solution2(id_list2, report2, k2)).isEqualTo(result2);

    }
}