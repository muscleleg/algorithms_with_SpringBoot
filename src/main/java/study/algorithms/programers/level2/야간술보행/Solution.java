package study.algorithms.programers.level2.야간술보행;
public class Solution {
    public int solution(int distance, int[][] scope, int[][] times) {
        int answer = distance;
        int soldierSize = scope.length;
        //index 조정 혼돈되서 index 0 버림)
        int[] table = new int[distance+1];
        for (int i = 0; i < soldierSize; i++) {
            int min = Math.min(scope[i][0],scope[i][1]);
            int max = Math.max(scope[i][0],scope[i][1]);
            for(int j = min; j <= max; j++){
                if(j % (times[i][0] + times[i][1]) == 0) {
                    continue;
                }
                if((j % (times[i][0] + times[i][1])) <= times[i][0]){
                     table[j]=1;
                     break;
                }
            }
        }

        for (int i =1; i <table.length; i++) {
            if(table[i]==1) return i ;
        }
        return answer;
    }
}
