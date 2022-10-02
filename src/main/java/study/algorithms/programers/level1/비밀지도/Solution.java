package study.algorithms.programers.level1.비밀지도;

import java.util.Arrays;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        String format = "%0"+Integer.toString(n)+"d";
        for (int i = 0; i < n; i++) {
//            String binaryString1 = String.format(format,Integer.parseInt(Integer.toBinaryString(65535)));
            //65535를 이진수로 변환하면 1111111111111111의 문자로 되는데 이 문자를 다시 Int로(parseInt) 바꾸려하면 int범위를 벗어난다.

            String binaryString1 = String.format(format,Long.parseLong(Integer.toBinaryString(arr1[i])));
            String binaryString2 = String.format(format,Long.parseLong(Integer.toBinaryString(arr2[i])));

            for (int j = 0; j < n; j++) {
                char binaryString1Index = binaryString1.charAt(j);
                char binaryString2Index = binaryString2.charAt(j);
                char tmp = binaryString1Index == '1' ? '#' : binaryString2Index == '1' ? '#' : ' ';
                answer[i] += tmp;
            }

        }
        return answer;
    }
    public String[] solution2(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] arrIndex = new int[n];
        String format = "%0"+Integer.toString(n)+"d";
        for(int i = 0; i < n; i++) {
            arrIndex[i] = arr1[i] | arr2[i];
            answer[i] = (String.format(format,Long.parseLong(Integer.toBinaryString(arrIndex[i])))).replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
    public String makeSharp(int n, int m) {
        if(n == 0) {
            if( m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#";
        }
    }
    //가장 좋은 방법 위의 방법들과 비교해 성능이 10배차이남
    public String[] solution3(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }

}
//                int binary1 = Integer.parseInt(String.valueOf(binaryArr1.charAt(j)));
//                int binary2 = Integer.parseInt(String.valueOf(binaryArr2.charAt(j)));
//                int tmp = binary1 == 1 ? 1 : binary2 == 1 ? 1 : 0;