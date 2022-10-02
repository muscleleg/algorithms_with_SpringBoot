package study.algorithms.programers.level1.하샤드의수;

public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int divideNum=0;
        int tmpX = x;
        while(tmpX!=0){
            divideNum = divideNum+(tmpX%10);
            tmpX=tmpX/10;
        }
        if (x % divideNum != 0) {
            answer = false;
        }
        return answer;
    }
}
