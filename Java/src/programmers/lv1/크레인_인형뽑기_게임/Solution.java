package programmers.lv1.크레인_인형뽑기_게임;

public class Solution {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] remove = new int[moves.length];
		int num = 0;

		for (int i : moves) {
			i = i - 1;
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != 0) {
					remove[num] = board[j][i];

					if (num - 1 >= 0 && remove[num] == remove[num - 1]) {
						answer += 2;
						remove[num - 1] = 0;
						remove[num] = 0;
						num -= 2;
					}

					board[j][i] = 0;
					num++;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(solution(board, moves));

	}

}
