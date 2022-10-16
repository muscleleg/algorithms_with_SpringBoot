package study.algorithms.programers.level1.최대공약수와최소공배수;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = 1;
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int x = 2;
        do {
            if((min % x==0) && (max % x==0)){
                min /= x;
                max /= x;
                answer[0] *=  x;
                if(min == 1 || max == 1){
                    break;
                }
                continue;
            }
                x++;
        } while (x <= min);
        answer[1] = answer[0] * min * max;
        return answer;
    }
}
