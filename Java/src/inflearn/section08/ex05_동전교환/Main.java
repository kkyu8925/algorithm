package inflearn.section08.ex05_동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int N, MAX, ANSWER = Integer.MAX_VALUE;

    public void dfs(int L, int sum, Integer[] arr) {
        if (sum > MAX || L >= ANSWER) {
            return;
        }

        if (sum == MAX) {
            ANSWER = L;
        } else {
            for (int coin : arr) {
                dfs(L + 1, sum + coin, arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 큰 금액 부터 계산하기 위해 정렬 - 시간복잡도 줄이기
        // Collections.reverseOrder()은 기본형 사용 불가능
        Arrays.sort(arr, Collections.reverseOrder());

        MAX = sc.nextInt();

        T.dfs(0, 0, arr);
        System.out.println(ANSWER);
    }
}
