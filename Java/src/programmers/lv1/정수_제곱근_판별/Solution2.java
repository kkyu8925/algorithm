package programmers.lv1.정수_제곱근_판별;

public class Solution2 {
	public static long solution(long n) {
		double a = Math.sqrt(n);
		return a == (int) a ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
	}

	public static void main(String[] args) {
		long n1 = 121;
		long n2 = 3;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}

}