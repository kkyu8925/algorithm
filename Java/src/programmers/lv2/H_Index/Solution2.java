package programmers.lv2.H_Index;

import java.util.Arrays;

class Solution2 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int tmp = Math.min(citations[i], citations.length - i);
            answer = Math.max(answer, tmp);
        }
        return answer;
    }
}
