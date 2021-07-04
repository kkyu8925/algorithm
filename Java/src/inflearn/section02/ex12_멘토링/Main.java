package inflearn.section02.ex12_멘토링;

import java.util.Scanner;

public class Main {
    private int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;

                for (int num = 0; num < m; num++) {
                    int ig = 0, jg = 0;
                    for (int grade = 0; grade < n; grade++) {
                        if (arr[num][grade] == i) ig = grade;
                        if (arr[num][grade] == j) jg = grade;
                    }
                    if (ig < jg) {
                        cnt++;
                    }
                }

                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }

}
