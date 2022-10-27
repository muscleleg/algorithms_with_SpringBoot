package study.algorithms.programers.level1.문자열내마음대로정렬;

public class Solution {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = {};
//        int size = strings.length;
//        int rank[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if(i==j){
//                    continue;
//                }
//                if(strings[i].charAt(n))
//            }
//        }
//        return answer;
//    }
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        int size = strings.length;


        for (int i = 1; i < size; i++) {
           outer : for (int j = 0; j < size - i; j++) {


                if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
                if (strings[j].charAt(n) == strings[j + 1].charAt(n)){
//                    int min = Math.min(strings[j].length(), strings[j + 1].length());
//                    for(int k = 0; k < min; k++) {
//                        if (strings[j].charAt(k) > strings[j + 1].charAt(k)) {
//                            String tmp = strings[j];
//                            strings[j] = strings[j + 1];
//                            strings[j + 1] = tmp;
//                            continue outer;
//                        }else if(strings[j].charAt(k) < strings[j + 1].charAt(k)){
//                            continue outer;
//                        }else{
//
//                        }
//                    }
//
//                    if (strings[j].length() > strings[j+1].length()) {
//                            String tmp = strings[j];
//                            strings[j] = strings[j + 1];
//                            strings[j + 1] = tmp;
//                    }
                    //compareTo()비교가 불가능한 지점의 각 문자열의 아스키값을 기준으로 비교를 해준다.
                    //출처: https://mine-it-record.tistory.com/133 [나만의 기록들:티스토리]
                    if (strings[j].compareTo(strings[j+1]) > 0 ) {
                            String tmp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = tmp;
                    }

                }
            }
        }
        answer = strings;
        return answer;
    }
    public String[] solution2(String[] strings, int n) {
        String[] answer = {};
        int size = strings.length;


        for (int i = 1; i < size; i++) {
            outer : for (int j = 0; j < size - i; j++) {


                if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
                if (strings[j].charAt(n) == strings[j + 1].charAt(n)){
                    int min = Math.min(strings[j].length(), strings[j + 1].length());
                    //그 부분을 간과했다.
                    //abcd, bbc가 있다고 했을때 a>b이면 당연히 위치를 바꾸는거고 a < b이면 for loop를 끝때야했다.
                    //왜냐하면 이미 결판 난것이니까 a < b보다 작으니 더이상 루프돌릴필요없다. abcd와 bbc는 위치를 바꿀 필요가 없는것이다.
                    //근데 나는 처음풀때 a>b인경우만 연산하고 a<b일 때는 전혀 고려하지 않았다. 그래서 문제가 틀렸다.
                    for(int k = 0; k < min; k++) {
                        if (strings[j].charAt(k) > strings[j + 1].charAt(k)) {
                            String tmp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = tmp;
                            continue outer;
                        }else if(strings[j].charAt(k) < strings[j + 1].charAt(k)){
                            continue outer;
                        }else{

                        }
                    }

                    if (strings[j].length() > strings[j+1].length()) {
                            String tmp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = tmp;
                    }
                }
            }
        }
        answer = strings;
        return answer;
    }
}
