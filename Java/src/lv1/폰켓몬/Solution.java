package lv1.폰켓몬;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> rSet = new HashSet<>();

        for (int i : nums) {
            rSet.add(i);
        }

        Iterator<Integer> it = rSet.iterator();
        while (it.hasNext()) {
            answer++;
            it.next();
        }

        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }

        return answer;
    }
}
