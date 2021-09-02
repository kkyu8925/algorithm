package inflearn.section10.ex02_돌다리_건너기;

import java.util.Scanner;

public class Main {
    static int[] DY;

    private int solution(int n) {
        // N(3<=N<=35)
        DY[1] = 1;
        DY[2] = 2;
        for (int i = 3; i < n + 2; i++) {
            DY[i] = DY[i - 2] + DY[i - 1];
        }
        return DY[n + 1];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DY = new int[n + 2];
        System.out.print(T.solution(n));
    }
}
