package inflearn.section08.ex11_미로의_최단거리_통로;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] DX = {-1, 0, 1, 0};
    static int[] DY = {0, 1, 0, -1};
    static int[][] BOARD, DIS;

    public void bfs(int x, int y) {
        Queue<Point> que = new LinkedList<>();
        que.offer(new Point(x, y));
        BOARD[x][y] = 1;
        while (!que.isEmpty()) {
            Point now = que.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now.x + DX[i];
                int nextY = now.y + DY[i];
                if (nextX >= 1 && nextX < 8 && nextY >= 1 && nextY < 8 && BOARD[nextX][nextY] == 0) {
                    BOARD[nextX][nextY] = 1;
                    que.offer(new Point(nextX, nextY));
                    DIS[nextX][nextY] = DIS[now.x][now.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        BOARD = new int[8][8];
        DIS = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                BOARD[i][j] = sc.nextInt();
            }
        }

        T.bfs(1, 1);
        if (DIS[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(DIS[7][7]);
        }
    }
}
