package programmers.lv2.예상_대진표;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;

        int left = Math.min(a, b);
        int right = Math.max(a, b);

        while (true) {
            if (left % 2 == 1 && right - left == 1) {
                break;
            }

            left = (left + 1) / 2;
            right = (right + 1) / 2;
            answer++;
        }


        return answer;
    }
}
