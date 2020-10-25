package lv1;

public class SumPositionNum {
	public static int solution(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n = n / 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		int a = 123;
		int b = 987;
		System.out.println(solution(a));
		System.out.println(solution(b));

	}

}
