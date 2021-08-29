package inflearn.section08.ex13_섬나라_아일랜드;

import java.util.Scanner;

public class Main {
    static int ANSWER = 0, N;
    static int[] DX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] DY = {0, 1, 1, 1, 0, -1, -1, -1};

    private void dfs(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            int nextX = x + DX[i];
            int nextY = y + DY[i];
            if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && board[nextX][nextY] == 1) {
                board[nextX][nextY] = 0;
                dfs(nextX, nextY, board);
            }
        }
    }

    public void solution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    ANSWER++;
                    board[i][j] = 0;
                    dfs(i, j, board);
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