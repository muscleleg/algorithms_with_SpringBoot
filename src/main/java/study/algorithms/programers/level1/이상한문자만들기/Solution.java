package study.algorithms.programers.level1.이상한문자만들기;

public class Solution {

        public String solution(String s) {
            String answer = "";
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = s.toCharArray();
            int cnt = 2;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==' '){
                    stringBuilder.append(' ');
                    cnt = -1;
                }else stringBuilder.append ((cnt % 2 == 0) ? Character.toUpperCase(chars[i]) :Character.toLowerCase(chars[i]));
                cnt++;
            }
            return stringBuilder.toString();
        }
}
