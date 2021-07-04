package inflearn.section02.ex06_뒤집은_소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            int res = 0;
            while (num > 0) {
                int remainder = num % 10;
                res = res * 10 + remainder;
                num = num / 10;
            }

            if (isPrime(res)) {
                answer.add(res);
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
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
