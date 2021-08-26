package inflearn.section08.ex08_순열_추측하기;

import java.util.Scanner;

public class Main {
    static int[] COMBINATION_RESULT, PM, CH; // permutation 순열
    static int N, RESULT;
    boolean FLAG = false;
    int[][] arr = new int[35][35];

    private int combination(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }
        if (r == 0 || n == r) {
            return arr[n][r] = 1;
        } else {
            return arr[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public void dfs(int L, int sum) {
        if (FLAG || sum > RESULT) {
            return;
        }

        if (L == N) {
            if (sum == RESULT) {
                for (int i : PM) {
                    System.out.print(i + " ");
                }
                FLAG = true;
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if (CH[i] == 0) {
                    CH[i] = 1;
                    PM[L] = i;
                    dfs(L + 1, sum + (PM[L] * COMBINATION_RESULT[L]));
                    CH[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        RESULT = sc.nextInt();
        PM = new int[N];
        CH = new int[N + 1];

        COMBINATION_RESULT = new int[N];
        for (int i = 0; i < N; i++) {
            COMBINATION_RESULT[i] = T.combination(N - 1, i);
        }

        T.dfs(0, 0);
    }
}
