package lv1;

public class Sqrt {
	public static long solution(long n) {
		double a = Math.sqrt(n);
		if (a == (int) a) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		} else
			return -1;
	}

	public static void main(String[] args) {
		long n1 = 121;
		long n2 = 3;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}

}
