package inflearn.section04.ex05_K번째_큰_수;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private int solution(int[] arr, int n, int k) {
        Set<Integer> rSet = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬

        // n에서 K개 뽑는 경우의 수
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    rSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (Integer integer : rSet) {
            cnt++;
            if (cnt == k) {
                return integer;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}
