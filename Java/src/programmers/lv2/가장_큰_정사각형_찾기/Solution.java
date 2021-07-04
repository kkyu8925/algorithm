package programmers.lv2.가장_큰_정사각형_찾기;

class Solution {
    public int solution(int[][] board) {

        // 우측하단부터 만들려고하는데, 길이가 1인경우에도 검사 될 수 있도록 크기가1더 큰 배열을 새로 만든다.
        int[][] newBoard = new int[board.length + 1][board[0].length + 1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                newBoard[i + 1][j + 1] = board[i][j];
            }
        }

        int max = 0;

        for (int i = 1; i < newBoard.length; i++) {
            for (int j = 1; j < newBoard[i].length; j++) {

                if (newBoard[i][j] >= 1) {
                    //좌측
                    int left = newBoard[i - 1][j];
                    //상단
                    int up = newBoard[i][j - 1];
                    //좌측상단(대각선)
                    int leftDiagonal = newBoard[i - 1][j - 1];

                    int min = Math.min(left, up);
                    min = Math.min(min, leftDiagonal);

                    newBoard[i][j] = min + 1;

                    max = Math.max(max, min + 1);
                }
            }
        }

        return (int) Math.pow(max, 2);

    }
}