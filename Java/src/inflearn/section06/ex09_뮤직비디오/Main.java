package inflearn.section06.ex09_뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().orElse(0);
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int capacity = (lt + rt) / 2;
            if (count(arr, capacity) <= m) {
                answer = capacity;
                rt = capacity - 1;
            } else {
                lt = capacity + 1;
            }
        }
        return answer;
    }

    private int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int num : arr) {
            if (sum + num > capacity) {
                cnt++;
                sum = num;
            } else {
                sum += num;
            }
        }
        return cnt;
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
