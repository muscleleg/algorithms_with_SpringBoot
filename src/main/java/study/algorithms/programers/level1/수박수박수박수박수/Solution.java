package study.algorithms.programers.level1.수박수박수박수박수;

public class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append((i % 2== 1) ? "수" : "박" ) ;
        }
        answer = stringBuilder.toString();
        return answer;
    }
}
