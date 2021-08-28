package inflearn.section08.ex09_조합_구하기;

import java.util.Scanner;

public class Main {
    static int[] COMBINATION;
    static int N, M; // N - 숫자 범위(N개의 수), M - 뽑을 갯수

    public void dfs(int L, int start) {
        if (L == M) {
            for (int i : COMBINATION) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= N; i++) {
                COMBINATION[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        COMBINATION = new int[M];
        T.dfs(0, 1);
    }
}
