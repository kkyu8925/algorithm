package lv1;

public class HarshadNum {
	public static boolean solution(int x) {
		int sum = 0;
		int num = x;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int x1 = 10;
		int x2 = 12;
		int x3 = 11;
		int x4 = 13;
		System.out.println(solution(x1));
		System.out.println(solution(x2));
		System.out.println(solution(x3));
		System.out.println(solution(x4));
	}

}
