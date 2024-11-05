package programmers.level1.second;

import java.util.HashSet;

public class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;

        int max = nums.length / 2;

        HashSet<Integer> numsSet = new HashSet<>();

        for (int n : nums)
            numsSet.add(n);

        if (numsSet.size() > max)
            return max;
        else
            return numsSet.size();
    }
}
