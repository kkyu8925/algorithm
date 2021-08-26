package inflearn.section08.ex07_조합_combination;

import java.util.Scanner;

/**
 * (n)C(r) = (n-1)C(r-1) + (n-1)C(r)
 * <p>
 * 5명 중에서 3명을 뽀는 경우의 수
 * = 4명중에서 2명을 뽑는 경우의수 + 4명 중에서 3명을 뽑는 경우의 수
 * <p>
 * 만약 1, 2, 3, 4, 5 5명이 있을 때 3명을 뽑는 경우의 수는
 * 5의 입장에서
 * 자신이 뽑혔을 때, 나머지 4명 중에서 2명을 뽑는 경우의 수 +
 * 자신이 뽑히지 않았을 때, 나머지 4명 중에서 3명을 뽑는 경우의 수
 */
public class Main {
    int[][] arr = new int[35][35];

    private int dfs(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }

        if (r == 0 || n == r) {
            return arr[n][r] = 1;
        } else {
            return arr[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }

    private int dfs_no_memoization(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return dfs_no_memoization(n - 1, r - 1) + dfs_no_memoization(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.dfs(n, r));
    }
}
