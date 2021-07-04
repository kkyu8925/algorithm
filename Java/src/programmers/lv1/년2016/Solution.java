package programmers.lv1.년2016;

public class Solution {
	public static String solution(int a, int b) {
		int allday = 0;
		String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		for (int i = 1; i < a; i++) {
			if (i == 2) {
				allday += 29;
			} else if (i <= 7 && i % 2 != 0 || i >= 8 && i % 2 == 0) {
				allday += 31;
			} else {
				allday += 30;
			}
		}
		allday += b;
		return day[allday % 7];
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.println(solution(a, b));
		int c = 5;
		int d = 24;
		System.out.println(solution(c, d));
	}
}
