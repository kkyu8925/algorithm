package inflearn.section08.ex15_피자배달거리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N; // 행, 열
    static int M; // M개의 피자집을 선택
    static int PIZZA_LEN, ANSWER = Integer.MAX_VALUE;
    static int[] COMBINATION;
    static List<Point> PIZZA, HOME;

    public void dfs(int L, int start) {
        if (L == M) {
            int sum = 0;
            for (Point h : HOME) {
                // 모든 집들과 뽑힌 피자가게중에서 최소 피자배달거리를 구한다.
                int dis = Integer.MAX_VALUE;
                for (int idx : COMBINATION) {
                    // 집과 피자집의 피자배달거리는 |x1-x2|+|y1-y2| 이다.
                    dis = Math.min(dis, Math.abs(h.x - PIZZA.get(idx).x) + Math.abs(h.y - PIZZA.get(idx).y));
                }
                sum = sum + dis; // 도시의 피자배달거리
            }
            // 도시의 피자배달거리 중에서 최소 피자배달거리
            ANSWER = Math.min(ANSWER, sum);
        } else {
            // combination
            // section08-ex09_조합_구하기 참고
            for (int i = start; i < PIZZA_LEN; i++) {
                COMBINATION[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 행, 열
        M = sc.nextInt();
        PIZZA = new ArrayList<>();
        HOME = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    // 1 - 집
                    HOME.add(new Point(i, j));
                } else if (tmp == 2) {
                    // 2 - 피자가게
                    PIZZA.add(new Point(i, j));
                }
            }
        }

        PIZZA_LEN = PIZZA.size();
        COMBINATION = new int[M];

        T.dfs(0, 0);
        System.out.println(ANSWER);
    }
}
