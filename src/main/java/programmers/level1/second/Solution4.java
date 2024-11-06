package programmers.level1.second;

import java.time.LocalDate;

public class Solution4 {
    public String solution(int a, int b) {
        String answer = "";
        answer = LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3).toUpperCase();
        return answer;
    }
}
