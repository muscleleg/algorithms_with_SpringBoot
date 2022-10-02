package study.algorithms.programers.level1.행렬의덧셈;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowSize = arr1.length;
        int columnSize=arr1[0].length;
        int[][] answer = new int[rowSize][columnSize];
        for (int r = 0; r < rowSize; r++) {
            for(int c = 0; c < columnSize;c++){
                answer[r][c] = arr1[r][c] + arr2[r][c];
            }
        }
        return answer;
    }
}
