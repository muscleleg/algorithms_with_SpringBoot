package study.algorithms.programers.level1.문제2016년;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;

import java.util.Locale;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        return answer;
    }
}
