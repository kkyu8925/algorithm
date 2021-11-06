package woo.ex1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[3];
        Map<Integer, Integer> rMap = new HashMap<>();
        for (int i = 1; i < 4; i++) {
            rMap.put(i, 0);
        }

        for (int num : arr) {
            rMap.put(num, rMap.get(num) + 1);
        }

        int max = 0;
        for (Integer num : rMap.keySet()) {
            if (rMap.get(num) > max) {
                max = rMap.get(num);
            }
        }

        for (Integer num : rMap.keySet()) {
            answer[num - 1] = max - rMap.get(num);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {2, 1, 3, 1, 2, 1};
        System.out.println(Arrays.toString(T.solution(arr)));
    }
}
