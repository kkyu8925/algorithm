package programmers.스택_큐.lv2_다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        int max = 0;

        for (int truck : truck_weights) {

            while (true) {
                if (que.isEmpty()) {
                    que.offer(truck);
                    max += truck;
                    answer++;
                    break;
                } else {
                    if (que.size() == bridge_length) {
                        max -= que.poll();
                    } else if (max + truck > weight) {
                        que.offer(0);
                        answer++;
                    } else {
                        que.offer(truck);
                        max += truck;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }

}
