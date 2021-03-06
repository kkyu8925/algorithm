package inflearn.section06.ex08_이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int solution(int n, int m, int[] arr) {
        // 이분검색은 정렬필수
        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (rt + lt) / 2;
            if (arr[mid] == m) {
                // 목표값 찾기 성공
                // 배열이므로 idx+1
                return mid + 1;
            } else if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
