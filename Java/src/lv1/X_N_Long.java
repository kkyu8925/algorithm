package lv1;

import java.util.Arrays;

public class X_N_Long {
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 1; i < n + 1; i++) {
			answer[i - 1] = (long) x * i;
		}
		return answer;
	}

	public static void main(String[] args) {
		int x1 = 2;
		int n1 = 5;
		System.out.println(Arrays.toString(solution(x1, n1)));
		int x2 = 4;
		int n2 = 3;
		System.out.println(Arrays.toString(solution(x2, n2)));
		int x3 = -4;
		int n3 = 2;
		System.out.println(Arrays.toString(solution(x3, n3)));
	}

}
