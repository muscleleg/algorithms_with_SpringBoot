package study.algorithms.programers.level1.정수제곱근판별;

public class Solution {
    public long solution(long n) {

        return Math.sqrt(n)==(int)Math.sqrt(n) ? (long) Math.pow(Math.sqrt(n)+1,2) : -1;
    }
}
