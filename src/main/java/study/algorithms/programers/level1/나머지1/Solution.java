package study.algorithms.programers.level1.나머지1;


    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i = 2; i < n; i++){
                if(n%i==1)
                    return i;
            }
            return answer;
        }
    }

