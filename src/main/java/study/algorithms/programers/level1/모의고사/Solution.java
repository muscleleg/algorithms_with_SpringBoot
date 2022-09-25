package study.algorithms.programers.level1.모의고사;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        HashMap<Integer, Integer> students = new HashMap<>();
        students.put(1, 0);
        students.put(2, 0);
        students.put(3, 0);
        for (int i = 0; i < answers.length; i++) {
            if(student1[(i % student1.length)] == answers[i]){
                students.put(1, students.get(1)+1);
            }
            if (student2[(i % student2.length)] == answers[i]) {
                students.put(2, students.get(2)+1);
            }
            if (student3[(i % student3.length)] == answers[i]) {
                students.put(3, students.get(3)+1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> studentsList = new ArrayList<>(students.entrySet());
        studentsList.sort(Map.Entry.comparingByValue());
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < studentsList.size(); i++){
//            int getValue =studentsList.get(i).getValue();
//            System.out.println("i = " + i +" , "+ getValue);
//            System.out.println(studentsList.get(i));
            if(studentsList.get(i).getValue() .equals(studentsList.get(studentsList.size()-1).getValue()) ){
                answer.add(studentsList.get(i).getKey());
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution T = new Solution();
        int[] answer1 = {1, 2, 3, 4, 5};
        System.out.println(T.solution(answer1));
    }
}
