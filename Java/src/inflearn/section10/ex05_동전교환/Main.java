package inflearn.section10.ex05_동전교환;

import java.util.Arrays;
import java.util.Scanner;

// 동전의 종류개숙가 많으면 DFS 시간복잡도 문제발생
// section08.ex05_동전교환
public class Main {
    static int MONEY;
    static int[] DY;

    private int solution(int[] coins) {
        Arrays.fill(DY, Integer.MAX_VALUE);
        DY[0] = 0;
        for (int coin : coins) {
            /*
             동전이 무한하면 앞에서부터 반복
             */
            for (int j = coin; j <= MONEY; j++) {
                // 예를 들어, 5원이 들어오면 5-5=0, dy[0]=0+1 > 5원 동전 하나만 걸러주면 된다.
                // 목표금액까지 반복
                DY[j] = Math.min(DY[j], DY[j - coin] + 1);
            }
        }
        return DY[MONEY];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MONEY = sc.nextInt();
        DY = new int[MONEY + 1];
        System.out.println(T.solution(arr));
    }
}
