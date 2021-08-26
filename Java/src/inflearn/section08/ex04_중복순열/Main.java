package inflearn.section08.ex04_중복순열;

import java.util.Scanner;

/**
 * 중복을 허용하여 N(NUM)번을 뽑아 일렬로 나열하는 경우
 */
public class Main {
    static int[] PM; // permutation 순열
    static int N, NUM; // NUM - 뽑는 횟수

    public void dfs(int L) {
        if (L == NUM) {
            for (int num : PM) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                PM[L] = i;
                dfs(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        NUM = sc.nextInt();

        PM = new int[NUM];
        T.dfs(0);
    }
}
