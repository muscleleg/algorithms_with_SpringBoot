package study.algorithms.programers.level1.콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int total = n;
        int reqCoke = a;
        int rewardCoke = b;

        while(reqCoke <= total){
            answer += (total / reqCoke) * rewardCoke;
            total = ((total / reqCoke) * rewardCoke) + (total % reqCoke);

        }
        return answer;
    }
}
