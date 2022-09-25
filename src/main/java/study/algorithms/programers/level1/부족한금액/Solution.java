package study.algorithms.programers.level1.부족한금액;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        long ticketPrice;
        for (int i = 1; i <= count; i++) {
            ticketPrice = price * i;
            answer = answer - (ticketPrice);
        }
        if(answer>0){
            return 0;
        }
        long abs = Math.abs(answer);
        return abs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(3,30,4) = " + solution.solution(3, 30, 4));
    }
}
