package woo.ex5;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int rows, int columns) {
        int[][] answer = new int[rows][columns];
        int nowRow = 0;
        int nowCol = 0;
        int lastNum = 1;
        answer[nowRow][nowCol] = lastNum;

        while (true) {
            int flag = lastNum % 2;
            if (flag == 1) {
                if (columns - 1 == nowCol) {
                    nowCol = 0;
                } else {
                    nowCol++;
                }
            } else {
                if (rows - 1 == nowRow) {
                    nowRow = 0;
                } else {
                    nowRow++;
                }
            }
            answer[nowRow][nowCol] = ++lastNum;

            int min = answer[0][0];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (min > answer[i][j]) {
                        min = answer[i][j];
                    }
                }
            }
            if (min != 0) {
                break;
            }
            if (rows == columns && lastNum == columns + rows) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int rows = 3;
        int columns = 4;
        System.out.println(Arrays.deepToString(T.solution(rows, columns)));
    }
}
