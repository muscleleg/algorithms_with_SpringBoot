package study.algorithms.programers.level1.p와y의개수;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount=0;
        int yCount=0;
        char[] chars = s.toCharArray();
        for (char ch : chars) {
           if(ch=='p'||ch=='P')pCount++;
           if(ch=='y'||ch=='Y')yCount++;
        }
        return (pCount==yCount);
    }
}
