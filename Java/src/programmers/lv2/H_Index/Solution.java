package programmers.lv2.H_Index;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        for (int i = 1; i <= citations.length; i++) {
            int cnt = 0;

            for (int citation : citations) {
                if (i <= citation) {
                    cnt++;
                }
            }

            if (cnt >= i) {
                answer = i;
            }
        }

        return answer;
    }
}
