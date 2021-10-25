package inflearn.section02.ex08_등수구하기;

import java.util.Scanner;

public class Main {
    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;

            for (int num : arr) {
                if (arr[i] < num) {
                    cnt++;
                }
            }

            answer[i] = cnt;
        }

        return answer;
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
