package programmers.lv1.두_개_뽑아서_더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> rSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                rSet.add(sum);
            }
        }

        int[] answer = new int[rSet.size()];

        Iterator<Integer> it = rSet.iterator();
        int i = 0;

        while (it.hasNext()) {
            answer[i] = it.next();
            i++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
