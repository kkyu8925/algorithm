package inflearn.section02.ex04_피보나치_수열;

import java.util.Scanner;

public class Main {
    private int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

    private void solution2(int n) {
        int a = 1, b = 1, c;
        System.out.println(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
