package inflearn.section08.ex02_바둑이_승자;

import java.util.Scanner;

public class Main {
    static int ANSWER = Integer.MIN_VALUE, MAX, N;

    public void dfs(int L, int sum, int[] arr) {
        if (sum > MAX) {
            return;
        }

        if (L == N) {
            ANSWER = Math.max(ANSWER, sum);
        } else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        MAX = sc.nextInt();
        N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        T.dfs(0, 0, arr);
        System.out.println(ANSWER);
    }
}
