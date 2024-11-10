package programmers.level1.second;

public class Solution7 {

    boolean solution(String s) {
        s = s.toLowerCase();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p')
                cnt++;
            if (s.charAt(i) == 'y')
                cnt--;
        }

        if (cnt == 0)
            return true;
        else
            return false;
    }
}
