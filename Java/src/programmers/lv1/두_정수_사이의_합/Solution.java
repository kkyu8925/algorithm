package programmers.lv1.두_정수_사이의_합;

public class Solution {
	public static long solution(int a, int b) {
		long sum = 0;
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else {
			for (int j = 0; j <= a; j++) {
				sum += j;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int a1 = 3;
		int b1 = 5;
		int a2 = 3;
		int b2 = 3;
		int a3 = 5;
		int b3 = 3;
		System.out.println(solution(a1, b1));
		System.out.println(solution(a2, b2));
		System.out.println(solution(a3, b3));
	}

}
