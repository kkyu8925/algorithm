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
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combination;
    static List<Point> pizza, house;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;
                for (int idx : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(idx).x) + Math.abs(h.y - pizza.get(idx).y));
                }
                sum = sum + dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    house.add(new Point(i, j));
                } else if (tmp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        len = pizza.size();
        combination = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
