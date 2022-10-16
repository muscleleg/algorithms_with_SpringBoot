package study.algorithms.programers.level1.정수내림차순으로배치하기;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        int[] answerArray;
        String s = String.valueOf(n);
        int size = s.length();
        answerArray = new int[size];
        for (int i = 0; i < size; i++) {

            answerArray[size-1-i] = (int) (n % 10);
            n/=10;

        }
        //118372//버블정렬 내림차순으로 이용
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j > i; j--) {
                if(answerArray[j-1] < answerArray[j]){
                    int t = answerArray[j-1];
                    answerArray[j-1] = answerArray[j];
                    answerArray[j] = t;
                }
            }

        }

        for (int i = size-1; i >= 0; i--) {
            answer += answerArray[i] * Math.pow(10, size-1-i);
        }
        return answer;
    }


}
