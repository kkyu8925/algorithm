package programmers.힙.lv3_이중우선순위큐;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minQ = new PriorityQueue<>();

        for (String operation : operations) {
            String[] splitStr = operation.split(" ");
            String command = splitStr[0];
            int num = Integer.parseInt(splitStr[1]);

            // 빈 큐에 데이터를 삭제 요청 경우 연산 무시
            if (minQ.size() < 1 && command.equals("D"))
                continue;

            // 삽입 시 최소 힙, 최대 힙에 value 넣기
            if (command.equals("I")) {
                minQ.offer(num);
                maxQ.offer(num);
                continue;
            }

            if (num < 0) {
                int min = minQ.poll();
                maxQ.remove(min);
            } else {
                int max = maxQ.poll();
                minQ.remove(max);
            }
        }

        if (minQ.size() > 0) {
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] operations = {"I 7", "I 5", "I -5", "D -1"};
        System.out.println("return = " + Arrays.toString(T.solution(operations)));
    }
}
