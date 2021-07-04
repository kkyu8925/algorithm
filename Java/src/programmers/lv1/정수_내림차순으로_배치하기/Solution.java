package programmers.lv1.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static long solution(long n) {
		String a = String.valueOf(n);
		String[] ar = a.split("");

		Arrays.sort(ar, Collections.reverseOrder());

		String b = String.join("", ar);
		return Long.valueOf(b);
	}

	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));

	}

}
