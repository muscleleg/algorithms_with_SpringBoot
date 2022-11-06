package study.algorithms.programers.level2.롤케이크자르기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int solution(int[] topping) {
        //[1, 2, 1, 3, 1, 4, 1, 2]
        int answer = 0;
        HashMap<Integer,Integer> meHashmap = new HashMap<Integer,Integer>();
        HashSet<Integer> broHashset = new HashSet<>();
        int meCnt = 0;
        for(int i = 0; i < topping.length; i++){
            if (meHashmap.containsKey(topping[i])) {
                meHashmap.put(topping[i],meHashmap.get(topping[i])+1);
            }else{
                meHashmap.put(topping[i],1);
                meCnt++;
            }
        }
        for(int i = 0; i < topping.length; i++){
                meHashmap.put(topping[i],meHashmap.get(topping[i])-1);
                broHashset.add(topping[i]);
                if(meHashmap.get(topping[i])<=0){
                    meCnt--;
                }
            int broCnt= broHashset.size();

            answer+=(meCnt==broCnt) ? 1 : 0;
        }
        return answer;
    }
}
