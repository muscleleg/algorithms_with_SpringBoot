package study.algorithms.programers.level1.카카오_아이디;

import java.util.Scanner;

public class Main {
     String solution(String new_id){
         new_id=new_id.toLowerCase();
         StringBuilder str = new StringBuilder(new_id);
         stepTwo(new_id,str);
         stepThree(new_id,str);



         return "";
    }

    private void stepTwo(String id,StringBuilder str) {
        for(int i=0; i<id.length();i++) {
            if ((Character.isUpperCase(str.charAt(i))) || (str.charAt(i)) == '-' || (str.charAt(i)) == '_' || (str.charAt(i)) == '.') {
                str.append(str.charAt(i));
            } else {

            }
        }
    }
    private void stepThree(String id,StringBuilder str) {
        
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println(T.solution(id));

    }




}
