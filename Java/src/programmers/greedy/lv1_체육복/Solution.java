package programmers.greedy.lv1_체육복;

class Solution {
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] student = new int[n];
		int answer = n;

		for (int l : lost) {
			student[l - 1]--;
		}
		for (int r : reserve) {
			student[r - 1]++;
		}

		for (int i = 0; i < student.length; i++) {
			if (student[i] == -1) {
				if (i - 1 >= 0 && student[i - 1] == 1) {
					student[i]++;
					student[i - 1]--;
				} else if (i + 1 < student.length && student[i + 1] == 1) {
					student[i]++;
					student[i + 1]--;
				} else
					answer--;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 3;
		int[] lost1 = { 2, 4 };
		int[] lost2 = { 2, 4 };
		int[] lost3 = { 3 };
		int[] reserve1 = { 1, 3, 5 };
		int[] reserve2 = { 3 };
		int[] reserve3 = { 1 };
		System.out.println(solution(n1, lost1, reserve1));
		System.out.println(solution(n2, lost2, reserve2));
		System.out.println(solution(n3, lost3, reserve3));
	}
}