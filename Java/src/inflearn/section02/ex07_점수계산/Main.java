package inflearn.section02.ex07_점수계산;

import java.util.Scanner;

public class Main {

    private int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int num : arr) {
            if (num == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
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

        System.out.println(T.solution(n, arr));
    }
}
