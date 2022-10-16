package study.algorithms.programers.level1.콜라츠추측;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while (n != 1){
            answer++;
            n = ((n % 2)==0) ? n / 2 : (n * 3) + 1;
            if (answer == 500) return -1;
        }

        return answer;
    }
}
