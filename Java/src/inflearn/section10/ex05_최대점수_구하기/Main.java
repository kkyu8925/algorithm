package inflearn.section10.ex05_최대점수_구하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            for (int j = m; j >= time; j--) {
                dy[j] = Math.max(dy[j], dy[j - time] + score);
                // 제한 시간이 20분일 때, 10분 짜리 문제가 들어온다면
                // 제한 시간잉 10분이였을 때 점수 + 해당 문제 점수 = 제한 시간이 20분일 때 문제점수
            }
        }
        System.out.println(dy[m]);
    }
}
