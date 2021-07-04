package inflearn.section02.ex02_보이는_학생;

import java.util.Scanner;

public class Main {
    private int solution(int n, int[] arr) {
        int answer = 0;
        int max = 0;

        for (int i : arr) {
            if (i > max) {
                answer ++;
                max = i;
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
