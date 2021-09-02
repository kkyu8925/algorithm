package inflearn.section10.ex04_가장_높은_탑_쌓기;

import java.util.*;

class Brick implements Comparable<Brick> {
    // s-넓이, h-높이, w-무게
    int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s; // 내림차순
    }
}

public class Main {
    static int[] DY;

    private int solution(Brick[] bricks) {
        Arrays.sort(bricks);
        DY[0] = bricks[0].h;
        for (int i = 1; i < bricks.length; i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                // 무게가 가벼워면서 최대값.
                if (bricks[i].w < bricks[j].w && DY[j] > max_h) {
                    max_h = DY[j];
                }
            }
            DY[i] = max_h + bricks[i].h;
        }
        return Arrays.stream(DY).max().getAsInt();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Brick[] arr = new Brick[n];
        DY = new int[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Brick(s, h, w);
        }
        System.out.println(T.solution(arr));
    }
}
