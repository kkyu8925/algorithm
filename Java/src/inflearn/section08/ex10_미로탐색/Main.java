package inflearn.section08.ex10_미로탐색;

import java.util.Scanner;

public class Main {
    static int[] DX = {-1, 0, 1, 0};
    static int[] DY = {0, 1, 0, -1};
    static int[][] BOARD;
    static int ANSWER = 0;

    private void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            ANSWER++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nextX = x + DX[i];
                int nextY = y + DY[i];
                if (nextX >= 1 && nextY <= 7 && nextY >= 1 && nextX <= 7 && BOARD[nextX][nextY] == 0) {
                    BOARD[nextX][nextY] = 1;
                    dfs(nextX, nextY);
                    BOARD[nextX][nextY] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        BOARD = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                BOARD[i][j] = sc.nextInt();
            }
        }

        BOARD[1][1] = 1;
        T.dfs(1, 1);
        System.out.println(ANSWER);
    }
}
