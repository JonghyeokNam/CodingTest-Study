package programmers.level1.second;

public class Solution1 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        long j = x;

        int i = 0;

        for (i = 0; i < n; i++) {
            answer[i] = x;
            x += j;
        }

        return answer;
    }
}
