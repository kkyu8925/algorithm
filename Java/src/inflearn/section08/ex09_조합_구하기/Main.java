package inflearn.section08.ex09_조합_구하기;

import java.util.Scanner;

public class Main {
    static int[] combination;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int i : combination) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combination = new int[m];
        T.DFS(0, 1);
    }
}
