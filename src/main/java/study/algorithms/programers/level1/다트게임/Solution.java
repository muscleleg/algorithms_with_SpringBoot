package study.algorithms.programers.level1.다트게임;

import java.util.Arrays;

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
         //==점수저장==//
        int[] score = {0, 0, 0};

        //==점수인덱스==//
        int count = -1;

        //==dartResult 배열로 변환==//
        char[] dartArray = dartResult.toCharArray();

        for (int i=0; i < dartArray.length; i++) {
            char dart = dartArray[i];
            int tmp = 0;
            //==숫자일때(0~10)==//
            if (Character.isDigit(dart)) {
                count++;
                //==1인지 10인지 구분==//
                if(Character.getNumericValue(dart)==1){
                    //==10일때==//
                    if(Character.getNumericValue(dartArray[i+1])==0){
                        score[count] = 10;
                        i++;
                    }else{
                        //==1일때==//
                        score[count] = Character.getNumericValue(dart);
                    }
                    //==0~9일때==//
                }else {
                    score[count] = Character.getNumericValue(dart);
                }

                //==문자일때(S,D,T)==//
            } else if (Character.isAlphabetic(dart)) {
                int n = (dart == 'S') ? 1 : (dart == 'D') ? 2 : 3;
                score[count] = (int) Math.pow(score[count], n);
            } else {
                //== * 혹은 #일때 ==//
                if (dart == '*') {
                    score[count] = score[count] * 2;
                    //== 첫번째 시도가 아닐때==//
                    if (count > 0) score[count - 1] = score[count - 1] * 2;
                }
                if (dart == '#') {
                    score[count] = score[count] * (-1);
                }
            }
        }
        answer = Arrays.stream(score).sum();
        return answer;
    }
}
