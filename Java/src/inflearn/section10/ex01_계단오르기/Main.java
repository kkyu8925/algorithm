package inflearn.section10.ex01_계단오르기;

import java.util.Scanner;

public class Main {
    static int[] DY;

    private int solution(int n) {
        // N(3<=N<=35)
        DY[1] = 1;
        DY[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            DY[i] = DY[i - 2] + DY[i - 1];
        }
        return DY[n];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DY = new int[n + 1];
        System.out.println(T.solution(n));
    }
}
