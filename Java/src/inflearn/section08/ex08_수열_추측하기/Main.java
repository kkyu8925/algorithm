package inflearn.section08.ex08_수열_추측하기;

import java.util.Scanner;

public class Main {
    static int[] b, p, check;
    static int n, result;
    boolean flag = false;
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

    public void DFS(int L, int sum) {
        if (flag) {
            return;
        }

        if (L == n) {
            if (sum == result) {
                for (int i : p) {
                    System.out.print(i + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result = sc.nextInt();
        b = new int[n];
        p = new int[n];
        check = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = T.combination(n - 1, i);
        }
        T.DFS(0, 0);
    }
}
