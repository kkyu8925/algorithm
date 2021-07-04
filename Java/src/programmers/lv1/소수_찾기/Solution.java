package programmers.lv1.소수_찾기;

public class Solution {
	public static int solution(int n) {
		int answer = 0;
		int[] ar = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			ar[i] = 0;
		}
		ar[0] = 1;
		ar[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			for (int j = 2; i * j <= n; j++) {
				ar[i * j] = 1;
			}
		}

		for (int i = 0; i < n + 1; i++) {
			if (ar[i] == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}

}
