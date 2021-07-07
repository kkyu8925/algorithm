package inflearn.section08.ex07_조합의_경우의수;

import java.util.Scanner;

public class Main {
    int[][] arr = new int[35][35];

    private int DFS(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }
        if (r == 0 || n == r) {
            return arr[n][r] = 1;
        } else {
            return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
