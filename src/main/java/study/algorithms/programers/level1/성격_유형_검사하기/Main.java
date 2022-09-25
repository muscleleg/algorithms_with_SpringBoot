package study.algorithms.programers.level1.성격_유형_검사하기;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public String solution(String[] survey, int[] choices) {
        Map<String,Integer> surveyMap=initSurveyMap();
        String answer = "";
        for (int i = 0; i < survey.length; i++) {
            if (choices[i]<4) {
                int left=0;
                calcScore(surveyMap,survey[i],left,choices[i]);
            }else if(choices[i]>4){
                int right=1;
                calcScore(surveyMap,survey[i],right,choices[i]);
            }
        }
        answer=printSurvey(surveyMap);
        return answer;
    }
    public Map<String, Integer> initSurveyMap() {
        Map<String, Integer> surveyMap = new HashMap<>();
        surveyMap.put("R", 0);
        surveyMap.put("T", 0);
        surveyMap.put("C", 0);
        surveyMap.put("F", 0);
        surveyMap.put("J", 0);
        surveyMap.put("M", 0);
        surveyMap.put("A", 0);
        surveyMap.put("N", 0);
        return surveyMap;
    }
    public void calcScore(Map<String,Integer> surveyMap,String survey,int leftRight,int score){
        switch (survey.charAt(leftRight)){
            case 'R':
                surveyMap.put("R",(surveyMap.get("R")+Math.abs(4-score)));
                break;
            case 'T':
                surveyMap.put("T", (surveyMap.get("T") + Math.abs(4 - score)));
                break;
            case 'C':
                surveyMap.put("C", (surveyMap.get("C") + Math.abs(4 - score)));
                break;
            case 'F':
                surveyMap.put("F", (surveyMap.get("F") + Math.abs(4 - score)));
                break;
            case 'J':
                surveyMap.put("J", (surveyMap.get("J") + Math.abs(4 - score)));;
                break;
            case 'M':
                surveyMap.put("M", (surveyMap.get("M") + Math.abs(4 - score)));;
                break;
            case 'A':
                surveyMap.put("A", (surveyMap.get("A") + Math.abs(4 - score)));;
                break;
            case 'N':
                surveyMap.put("N", (surveyMap.get("N") + Math.abs(4 - score)));;
                break;
        }

    }
    public String printSurvey(Map<String,Integer> surveyMap){
        String answer = "";
        if(surveyMap.get("R")>=surveyMap.get("T")) {
            answer+="R";
        }else {
            answer+="T";
        }
        if(surveyMap.get("C")>=surveyMap.get("F")){
            answer+="C";
        }else{
            answer+="F";
        }
        if(surveyMap.get("J")>=surveyMap.get("M")){
            answer+="J";
        }else {
            answer+="M";
        }
        if(surveyMap.get("A")>=surveyMap.get("N")){
            answer+="A";
        }else {
            answer+="N";
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();

        String[] survey1 = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choice1 = {5, 3, 2, 7, 5};
        String[] survey2 = {"TR", "RT", "TR"};
        int[] choice2 = {7, 1, 3};

        System.out.println(T.solution(survey1, choice1));
        System.out.println(T.solution(survey2,choice2));
    }
}
