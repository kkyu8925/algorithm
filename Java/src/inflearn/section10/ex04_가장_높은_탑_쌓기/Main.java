package inflearn.section10.ex04_가장_높은_탑_쌓기;

import java.util.*;

class Brick implements Comparable<Brick> {
    int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class Main {
    static int[] dy;

    private int solution(Brick[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        dy[0] = arr[0].h;
        answer = dy[0];
        for (int i = 1; i < arr.length; i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i].w < arr[j].w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr[i].h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Brick[] arr = new Brick[n];
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Brick(s, h, w);
        }
        System.out.println(T.solution(arr));
    }
}
