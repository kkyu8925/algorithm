package inflearn.section05.ex03_크레인_인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                int num = board[i][move - 1];
                if (num > 0) {
                    board[i][move - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == num) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(num);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
