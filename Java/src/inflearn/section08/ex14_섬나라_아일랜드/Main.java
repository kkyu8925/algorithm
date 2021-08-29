package inflearn.section08.ex14_섬나라_아일랜드;

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
    static int ANSWER = 0, N;
    static int[] DX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] DY = {0, 1, 1, 1, 0, -1, -1, -1};

    private void bfs(int x, int y, int[][] board) {
        Queue<Point> que = new LinkedList<>();
        que.offer(new Point(x, y));
        while (!que.isEmpty()) {
            Point now = que.poll();
            for (int i = 0; i < 8; i++) {
                int nextX = now.x + DX[i];
                int nextY = now.y + DY[i];
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && board[nextX][nextY] == 1) {
                    board[nextX][nextY] = 0;
                    que.add(new Point(nextX, nextY));
                }
            }
        }
    }

    private void solution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    ANSWER++;
                    board[i][j] = 0;
                    bfs(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // arr init
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        T.solution(arr);
        System.out.println(ANSWER);
    }
}
