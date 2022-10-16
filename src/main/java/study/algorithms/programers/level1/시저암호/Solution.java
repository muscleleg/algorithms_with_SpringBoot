package study.algorithms.programers.level1.시저암호;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if(ch==' '){
                stringBuilder.append(ch);
                continue;
            }
            if(ch >= 'A' && ch <= 'Z'){
                int str = (ch + n > 'Z') ? ('A' - 1) + ((ch + n) - 'Z') : ch + n;
                stringBuilder.append(Character.toChars(str));
                continue;
            }
            if( ch >='a' && ch <='z'){
                int str = (ch + n > 'z') ? ('a' - 1) + ((ch + n) - 'z') : ch + n;
                stringBuilder.append(Character.toChars(str));
            }

        }
        answer = stringBuilder.toString();
        return answer;
    }
}
//            stringBuilder.append(
//
//                    Character.toChars(
//                            (ch == ' ') ? ch :
//                                    (ch >= 'A' && ch <= 'Z') ? ch + n > 'Z' ? 'A'-1 + ch + n - 'Z' :(
//                                            ( ch >='a' && ch <='z') ? ((ch + n > 'Z') ? 'A'-1 + ch + n - 'Z': ch+n ):ch+n
//                                    )
//                    )
//            );