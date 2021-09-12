package programmers.완전탐색.lv2_카펫;

class Solution {
    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int sum = brown + yellow;

        for (int i = 3; i <= sum; i++) {

            if (sum % i == 0) {
                int width = sum / i;
                int height = sum / width;

                int minWidth = width - 2;
                int minHeight = height - 2;
                if (minWidth * minHeight == yellow && width >= height) {
                    return new int[]{width, height};
                }
            }
        }

        return answer;
    }
}
