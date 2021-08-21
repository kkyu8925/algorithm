package inflearn.section06.ex01_선택정렬;

import java.util.Scanner;

/**
 * 하나의 숫자를 선택한 후에 정렬하지 않은 나머지 숫자들과 비교해서 가장 작은 숫자로 바꾼다.
 */
public class Main {
    private int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            if (idx != i) {
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
