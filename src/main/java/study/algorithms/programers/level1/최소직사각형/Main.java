package study.algorithms.programers.level1.최소직사각형;
//https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Main {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp=0;
        int widthMax=0;
        int heightMax=0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0]<sizes[i][1]){
                tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
            if(sizes[i][0]>widthMax){
                widthMax=sizes[i][0];
            }
            if(sizes[i][1]>heightMax){
                heightMax=sizes[i][1];
            }
        }
        answer=widthMax*heightMax;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(T.solution(sizes1));
        System.out.println(T.solution(sizes2));
        System.out.println(T.solution(sizes3));

    }
}
