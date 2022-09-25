//https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
package study.algorithms.programers.level1.폰켓몬;

import java.util.HashSet;

public class Main {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        HashSet<Integer> pocketMon = new HashSet<Integer>();
        for (int num:nums) {
            pocketMon.add(num);
        }
        answer=(pocketMon.size()>max)?max: pocketMon.size();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        boolean solution1=(T.solution(nums1)==2)?true:false;
        System.out.println("solution nums1= " + solution1);
        boolean solution2=(T.solution(nums2)==3)?true:false;
        System.out.println("solution nums1= " + solution2);
        boolean solution3=(T.solution(nums3)==2)?true:false;
        System.out.println("solution nums1= " + solution3);

    }
}
