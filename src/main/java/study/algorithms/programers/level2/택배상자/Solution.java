package study.algorithms.programers.level2.택배상자;

import java.util.Stack;

public class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        int i =1;
        while(i <= order.length){
            if (i == order[index]) {
                index++;
                answer++;
                i++;
            }else{
                if(!stack.empty()){
                    if(stack.peek()==order[index]){
                        stack.pop();
                        index++;
                        answer++;
                    }else{
                        stack.push(i);
                        i++;
                    }
                }else{
                    stack.push(i);
                    i++;
                }
            }
        }
        for(int j = index; j < order.length; j++){
            if (stack.peek()== order[index]) {
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}