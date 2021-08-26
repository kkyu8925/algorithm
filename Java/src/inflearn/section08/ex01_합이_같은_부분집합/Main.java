package inflearn.section08.ex01_합이_같은_부분집합;

import java.util.Scanner;

public class Main {
    static String ANSWER = "NO";
    static int N, TOTAL = 0;
    boolean FLAG = false;

    public void dfs(int L, int sum, int[] arr) {
        if (FLAG || sum > TOTAL / 2) {
            return;
        }

        if (L == N) {
            if (TOTAL - sum == sum) {
                ANSWER = "YES";
                FLAG = true;
            }
        } else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            TOTAL += arr[i];
        }
        T.dfs(0, 0, arr);
        System.out.println(ANSWER);
    }
}
