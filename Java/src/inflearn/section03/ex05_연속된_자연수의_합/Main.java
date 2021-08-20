package inflearn.section03.ex05_연속된_자연수의_합;

import java.util.Scanner;

public class Main {
    private int solution(int n) {
        int answer = 0;

        int m = n / 2 + 1; // 15이면 7+8, 8까지만 등장가능
        int[] arr = new int[m];

        // 배열 초기화
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        int sum = 0, lt = 0;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // 수학적 방법
    // 1부터 연속된 숫자를 할당하고 남은수가 할당된 숫자만큼 나누어 떨어지면 연속된 숫자
    // n=15이고 1, 2, 3 일 때,  남은수 9는 3(1,2,3)으로 나누어 떨어지므로 4,5,6 연속된 숫자
    private int solution2(int n) {
        int answer = 0;
        int cnt = 1;
        n = n - cnt;

        while (n > 0) {
            cnt++;
            n = n - cnt;

            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution2(n));
    }
}
