package inflearn.section08.ex06_순열;


import java.util.Scanner;

/**
 * 중복을 허용하지 않고 N(NUM)번을 뽑아 일렬로 나열하는 경우
 */
public class Main {
    static int[] PM, CH; // permutation 순열
    static int N, NUM; // NUM - 뽑는 횟수

    private void dfs(int L, int[] arr) {
        if (L == NUM) {
            for (int i : PM) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (CH[i] == 0) {
                    CH[i] = 1;
                    PM[L] = arr[i];
                    dfs(L + 1, arr);
                    CH[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        NUM = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        CH = new int[N];
        PM = new int[NUM];

        T.dfs(0, arr);
    }
}
