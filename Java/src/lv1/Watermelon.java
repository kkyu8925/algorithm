package lv1;

public class Watermelon {
	public static String solution(int n) {
		String answer = "";
		String su = "수";
		String bak = "박";

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer += su;
			} else {
				answer += bak;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int i = 3;
		int j = 4;
		System.out.println(solution(i));
		System.out.println(solution(j));
	}
}
