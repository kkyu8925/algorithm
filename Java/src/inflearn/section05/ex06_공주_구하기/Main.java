package inflearn.section05.ex06_공주_구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private int solution2(int n, int k) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            que.offer(i);
        }

        while (!que.isEmpty()) {
            for (int i = 1; i < k; i++) {
                que.offer(que.poll());
            }
            que.poll();
            if (que.size() == 1) {
                answer = que.poll();
            }
        }
        return answer;
    }

    private int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            que.offer(i);
        }

        int cnt = 0;
        while (!que.isEmpty()) {
            int num = que.poll();
            cnt++;
            if (cnt == k) {
                cnt = 0;
            } else {
                que.offer(num);
            }

            if (que.size() == 1) {
                answer = que.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
    }
}
