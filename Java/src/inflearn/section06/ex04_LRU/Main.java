package inflearn.section06.ex04_LRU;

import java.util.Scanner;

public class Main {
    private int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int num : arr) {
            int idx = -1;
            // cache hit
            for (int i = 0; i < size; i++) {
                if (cache[i] == num) {
                    idx = i;
                }
            }

            if (idx == -1) {
                // cache miss
                for (int i = size - 1; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                // cache hit
                for (int i = idx; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = num;
        }
        return cache;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(size, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
