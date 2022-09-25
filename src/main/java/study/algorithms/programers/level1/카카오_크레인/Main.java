package study.algorithms.programers.level1.카카오_크레인;

import java.util.Stack;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int moveLen = moves.length;
        Stack<Integer> bucket = new Stack<>();

        for(int i = 0; i<moveLen; i++) {
            int m = moves[i]-1; //배열의 index는 0부터니까 1을 빼주었음

            for (int x = 0; x < board.length; x++) {
                if (board[x][m] != 0) { //크레인이 잡는곳이 빈곳이 아닐때
                    answer = extractDoll(board, moves, answer, bucket, i, m, x);
                    board[x][m]= 0; //크레인이 잡은곳 비우기
                    break; //맨위의 것을 잡고 끝내야함, break를 안쓰면 board[1][m]에서 꺼내는게 아니라 board[2][m]까지도 꺼내버림
                }
            }

        }


        return answer;
    }

    private int extractDoll(int[][] board, int[] moves, int answer, Stack<Integer> bucket, int i, int m, int x) {
        if (!bucket.empty()) { //bucket이 비어있지않을때
            if (bucket.peek() == board[x][m]) {
                bucket.pop();
                answer += 2;
            } else {
                bucket.push(board[x][m]);
            }
        } else {
            bucket.push(board[x][m]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[][] board =
                       {{0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(T.solution(board, moves));
    }
}
