package inflearn.section10.ex03_최대부분증가수열;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    static int[] DY;

    private int solution(int[] arr) {
//        int answer = 0;
        DY = new int[arr.length];
        DY[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;

            // 이전 배열 탐색
            for (int j = i - 1; j >= 0; j--) {
                // 작으면서 최대의 경우의 수 선택
                if (arr[j] < arr[i] && DY[j] > max) {
                    max = DY[j];
                }
            }

            DY[i] = max + 1;
//            answer = Math.max(answer, DY[i]);
        }
        return Arrays.stream(DY).max().getAsInt();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
