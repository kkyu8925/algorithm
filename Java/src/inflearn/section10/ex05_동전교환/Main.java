package inflearn.section10.ex05_동전교환;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] dy;

    private int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
                // 예를 들어, 5원이 들어오면 5-5=0, dy[0]=0+1 > 5원 동전 하나만 걸러주면 된다.
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(T.solution(arr));
    }
}
