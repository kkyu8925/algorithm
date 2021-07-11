package dev.ex01;

class Solution {
    public int solution(int[] d, int m) {
        int answer = 0;
        int cnt = 1;
        // cnt=4
        for (int i : d) {
            if (i >= cnt) {
                m = m - cnt;
                cnt = cnt * 2;
                answer++;
            } else {
                cnt = 1;
                answer++;
            }

            if (m <= 0) {
                break;
            }
        }

        if (m > 0) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] d = {2, 2, 4, 3};
        int m = 8;
        System.out.println(T.solution(d, m));
    }
}
