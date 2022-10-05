package study.algorithms.programers.level1.신고결과받기;

import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //report의 중복데이터, 한사람이 똑같은 사람 두번 신고한 것을 없애기위한 set
        HashSet<String> rawReportSet = removeDuplicate(report);
        //id_list를 key로 value를 0으로 초기화한 map
        HashMap<String, Integer> idListMap = new HashMap<>();


        //report를 key와 value로 분리하고 map으로 새로저장, 누적 신고수를 idListMap에 저장
        HashMap<String, String> reportMap = new HashMap<>();
        for (String s : rawReportSet) {
            String key = s.substring(0,s.indexOf(' '));
            String value = s.substring(s.indexOf(' ')+1, s.length());
//            reportMap.put(key, value);
            if(idListMap.get(value)==null){
                idListMap.put(value, 1);

            }else {
                idListMap.put(value, idListMap.get(value) + 1);
            }
        }

        for (Map.Entry<String, Integer> idListEntry : idListMap.entrySet()) {
            if(idListEntry.getValue()>=k){
                for (String s : rawReportSet) {
                    String key = s.substring(0, s.indexOf(" "));
                    String value = s.substring(s.indexOf(" ") + 1, s.length());
                    if (idListEntry.getKey().equals(value)) {
                        int i = 0;
                        for (String id : id_list) {
                            if(id.equals(key)){
                                answer[i]+=1;
                            }
                            i++;
                        }
                    }
                }
            }
        }

        return answer;
    }
    public HashSet<String> removeDuplicate(String[] report) {
        HashSet<String> set = new HashSet<>();
        for (String s : report) {
            set.add(s);
        }
        return set;
    }
    public int[] solution2(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //report의 중복데이터, 한사람이 똑같은 사람 두번 신고한 것을 없애기위한 set

        //id_list를 key로 value를 0으로 초기화한 map
        Map<String, HashSet<String>> idListMap = new HashMap<>();


        //report를 key와 value로 분리하고 map으로 새로저장, 누적 신고수를 idListMap에 저장
//        HashMap<String, String> reportMap = new HashMap<>();
        for (String s : report) {
            String[] keyValue = s.split(" ");
            String key = keyValue[0];
            String value = keyValue[1];

            if (idListMap.get(value) == null) {
                HashSet<String> reportSet = new HashSet<>();
                reportSet.add(key);
                idListMap.put(value, reportSet);
            }else{
                idListMap.get(value).add(key);
            }

        }
        for (String key : idListMap.keySet()) {
            HashSet<String> set = idListMap.get(key);
            if (set.size() >= k) {
                for (String s : set) {
                    int i = 0;
                    for (String id : id_list) {
                        if(s.equals(id)){
                            answer[i] += 1;
                            break;
                        }
                        i++;
                    }
                }

            }
        }
        return answer;
    }


}
