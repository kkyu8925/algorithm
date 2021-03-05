package lv1.최대공약수와_최소공배수;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int n, int m) {
		int[] answer = { gcd(n, m), lcm(n, m) };
		return answer;
	}

	public static int gcd(int n, int m) {
		if (m == 0) {
			return n;
		} else {
			return gcd(m, n % m);
		}
	}

	public static int lcm(int n, int m) {
		return n * m / gcd(n, m);
	}

	public static void main(String[] args) {
		int n1 = 3;
		int m1 = 12;
		System.out.println(Arrays.toString(solution(n1, m1)));
		int n2 = 2;
		int m2 = 5;
		System.out.println(Arrays.toString(solution(n2, m2)));
	}

}
