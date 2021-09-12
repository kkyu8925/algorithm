package programmers.힙.lv3_디스크_컨트롤러;

import java.util.*;

class Solution {

    public int solution(int[][] jobs) {
        int answer = 0;
        int cnt = 0;
        int nowTime;

        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));
        nowTime = jobs[0][0];

        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        int i = 0;
        while (cnt < jobs.length) {
            while (i < jobs.length && jobs[i][0] <= nowTime) {
                queue.offer(jobs[i++]);
            }

            if (!queue.isEmpty()) {
                int[] job = queue.poll();
                nowTime += job[1];
                answer += nowTime - job[0];
                cnt++;
            } else {
                nowTime = jobs[i][0];
            }
        }

        return answer / cnt;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(T.solution(jobs));
    }
}