/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
package study.algorithms.programers.level1.완주하지_못한_선수;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> pHashMap = new HashMap<>();
        /**
         * participant와 completion비교를 위해 participant를 해쉬맵으로 초기화, key : 이름, value : 해당 이름의 수
         */
        for (String p : participant) {
            if(pHashMap.containsKey(p)){
            pHashMap.put(p,(pHashMap.get(p)+1));
            }else{
                pHashMap.put(p,1);
            }
        }

        for(String c:completion){
            pHashMap.put(c,(pHashMap.get(c)-1));
        }

        /**
         * pHashMap.forEach로 하니 외부 answer에 데이터를 담을 수 없음 데이터 담을려면 final로 사용해야한다고 하는데 찾아보시길
         */
//        pHashMap.forEach((key,value)->{
//            if(value>0){
//                System.out.print("\""+key+"\"");
//            }
//        });
        Iterator<Map.Entry<String, Integer>> pIterator = pHashMap.entrySet().iterator();
        while (pIterator.hasNext()){
            Map.Entry<String, Integer> p = pIterator.next();
            if(p.getValue()>0){
                answer += p.getKey();
            }
        }
        return answer;
    }
    public String solution2(String[] participant, String[] completion) { // 속도 느려서 실패
        String answer = "";
        boolean a;
        for (int i = 0; i < completion.length; i++){
            for (int j = 0; j < participant.length; j++) {
                if(completion[i].equals(participant[j])){
                    participant[j] = "1";
                    completion[i] = "0";

                }
            }
        }
        for (String s : participant) {
            if(s!="1"){
                answer+=s;
            }
        }
        return answer;
    }
    public String solution1(String[] participant, String[] completion) { // 속도 느려서 실패
        String answer = "";
        ArrayList<String> participantArrayList = new ArrayList<>();
        for (String p : participant) {
            participantArrayList.add(p);
        }
        for (String s : completion) {
            int index = participantArrayList.indexOf(s);
            participantArrayList.remove(index);
        }
        answer=participantArrayList.toString();
        answer=answer.replaceAll("[\\[\\]]","");
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println(s.solution(participant1,completion1));

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(s.solution(participant2,completion2));

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(s.solution(participant3,completion3));
    }
}
