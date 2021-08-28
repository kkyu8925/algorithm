package inflearn.section08.ex12_토마토;

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
    static int N, M; // 행,렬
    static Queue<Point> que = new LinkedList<>();

    private void bfs() {
        while (!que.isEmpty()) {
            Point now = que.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now.x + DX[i];
                int nextY = now.y + DY[i];
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && BOARD[nextX][nextY] == 0) {
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
        M = sc.nextInt();
        N = sc.nextInt();
        BOARD = new int[N][M];
        DIS = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                BOARD[i][j] = sc.nextInt();
                if (BOARD[i][j] == 1) {
                    que.offer(new Point(i, j));
                }
            }
        }

        T.bfs();

        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (BOARD[i][j] == 0) {
                    flag = false; // 익지 않은 토마토 존재함(-1으로 막혀있을 때)
                    break;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    answer = Math.max(answer, DIS[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            // 익지 않은 토마토가 존재할 때
            System.out.println(-1);
        }
    }
}
