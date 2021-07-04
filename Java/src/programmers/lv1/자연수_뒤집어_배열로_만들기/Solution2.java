package programmers.lv1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Solution2 {
	public static int[] solution(long n) {
		int i = 0;
		String a = String.valueOf(n);
		int[] answer = new int[a.length()];
		while (n > 0) {
			answer[i] = (int) n % 10;
			n /= 10;
			i++;
		}
		return answer;
	}

	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}

}
