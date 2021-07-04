package programmers.lv1.약수의_합;

public class Solution {
	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		System.out.println(solution(a));
		System.out.println(solution(b));
	}

}
