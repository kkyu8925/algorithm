package programmers.lv1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Solution {
	public static int[] solution(long n) {
		String a = String.valueOf(n);
		String[] s = a.split("");

		int[] answer = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			answer[i] = Integer.valueOf(s[s.length - i - 1]);
		}
		return answer;
	}

	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}

}
