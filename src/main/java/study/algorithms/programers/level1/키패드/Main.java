package study.algorithms.programers.level1.키패드;

public class Main {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        for(int num : numbers){
            switch (num) {
                case 1: case 4: case 7:
                    answer += "L";
                    left=num;
                    break;
                case 3: case 6: case 9:
                    answer += "R";
                    right=num;
                    break;
                case 2: case 5: case 8: case 0:
                    if(num==0) num=11;
                    int leftFinger = calc(left, num);
                    int rightFinger = calc(right,num);
                    if(leftFinger>rightFinger){
                        answer+="R";
                        right=num;
                    } else if(leftFinger<rightFinger){
                        answer+="L";
                        left=num;
                    }else{
                        if(hand.equals("left")){
                            answer += "L";
                            left=num;
                        }else {
                            answer += "R";
                            right=num;
                        }
                    }
                    break;
            }

            }
            return answer;
        }

    private int calc(int finger, int num) {
        int fingerX=(finger-1)/3;
        int fingerY=(finger-1)%3;
        int numX=(num-1)/3;
        int numY=(num-1)%3;
        int distance=Math.abs(fingerX-numX)+Math.abs(fingerY-numY);
        return distance;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] num2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Main T = new Main();
        System.out.println(T.solution(num1, "right"));
        System.out.println(T.solution(num2, "left"));
        System.out.println(T.solution(num3, "right"));
    }
}
