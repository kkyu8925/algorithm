package lv2.더맵게;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int food : scoville) {
            pq.offer(food);
        }

        while (pq.peek() < K) {
            if (pq.size() == 1) {
                return -1;
            }
            int one = pq.poll();
            int two = pq.poll();

            pq.offer(one + (two * 2));
            answer++;
        }
        return answer;
    }
}
