package programmers.lv1.콜라츠_추측;

public class Solution {

	public static int solution(long num) {
		int cnt = 0;
		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			cnt++;
			if (cnt == 500) {
				return -1;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		long n1 = 6;
		long n2 = 16;
		long n3 = 626331;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
		System.out.println(solution(n3));
	}

}
