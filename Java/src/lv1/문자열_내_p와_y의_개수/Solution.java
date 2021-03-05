package lv1.문자열_내_p와_y의_개수;

public class Solution {
	static boolean solution(String s) {
		boolean answer = true;
		int p = 0;
		int y = 0;
		String[] ar = s.split("");
		for (int i = 0; i < ar.length; i++) {
			if ("p".equalsIgnoreCase(ar[i])) {
				p++;
			} else if ("y".equalsIgnoreCase(ar[i])) {
				y++;
			}
		}
		if (p != y) {
			return false;
		}
		return answer;
	}

	public static void main(String[] args) {
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
}
