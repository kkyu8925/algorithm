package inflearn.section08.ex03_최대점수_구하기;

import java.util.Scanner;

public class Main {
    static int ANSWER = Integer.MIN_VALUE, N, MAX;

    public void dfs(int L, int sum, int time, int[] score, int[] times) {
        if (time > MAX) {
            return;
        }

        if (L == N) {
            ANSWER = Math.max(ANSWER, sum);
        } else {
            dfs(L + 1, sum + score[L], time + times[L], score, times);
            dfs(L + 1, sum, time, score, times);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        MAX = sc.nextInt();

        int[] score = new int[N];
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }

        T.dfs(0, 0, 0, score, times);
        System.out.println(ANSWER);
    }
}
