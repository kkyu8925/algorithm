package inflearn.section02.ex11_임시반장_정하기;

import java.util.Scanner;

public class Main {
    private int solution(int n, int[][] arr) {
        int answer = 0;
        int maxCnt = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            // 다른 학생과 같은 반이었는지 체크
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (maxCnt < cnt) {
                maxCnt = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
