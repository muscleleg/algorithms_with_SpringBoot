package study.algorithms.programers.level1.숫자짝꿍_중요;
/**
 * int[]에 숫자카운트를 넣어두고
 * [1,0,3,2,4]
 * [1,1,1,1,1]
 * 원소에 1씩 빼면서 두 베열이 0이 되기전까지 sb.append에 넣음
 * sb.append [1,0,1,1,1]가 들어간 부분
 * 숫자로 변환 0,2,3,4
 * 가장 큰값으로 정렬 432(내림차순으로하면 가진수중 가장 큰 값으로됨)
 */

import java.util.*;

public class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> integers = new ArrayList<>();
        //3 1
        //1 3
        //3 3
//        char[] maxStr = (X.length() >= Y.length()) ? X.toCharArray() : Y.toCharArray();
//        char[] minStr = (X.length()<Y.length())? X.toCharArray() : Y.toCharArray();
//        ArrayList<Character> maxList = new ArrayList<>();
//        for (char c : maxStr) {
//            maxList.add(c);
//        }
//        int maxStrSize = maxStr.length;
//        int minStrSize = minStr.length;
//        int cnt =0;
//
//
//        for (int i=0; i < minStrSize; i++) {
//            if(maxList.contains(minStr[i])){
//
//            }
//        }

        //추가된 상태를 넘어가야함
        String maxStr = (X.length() >= Y.length()) ? X: Y;
        String minStr = (X.length()<Y.length())? X: Y;
        for (int i=0; i < minStr.length(); i++) {
            for (int j = 0; j < maxStr.length(); j++) {

                    if (minStr.charAt(i) == maxStr.charAt(j)) {
                        integers.add(j);
                        sb.append(minStr.charAt(i));
                        break;
                    }
            }
        }


        if(sb.toString().equals("")) return "-1";
        String temp = sb.toString();
        temp = temp.replaceAll("0", "");
        if(temp.equals("")) return "0";
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        answer = new StringBuilder(new String(chars)).reverse().toString();

        return answer;
    }
    public String solution2(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] arrX = new int[10];
        int[] arrY = new int[10];

        countNumInArr(X, arrX);
        countNumInArr(Y, arrY);

        for (int i = arrX.length - 1; i >= 0; i--) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;

                answer.append(i);
            }
        }

        if (answer.toString().equals("")) {
            return "-1";
        } else if (answer.toString().startsWith("0")) {
            return "0";
        } else {
            return answer.toString();
        }
    }

    private void countNumInArr(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - '0';

            arr[index]++;
        }
    }
}
