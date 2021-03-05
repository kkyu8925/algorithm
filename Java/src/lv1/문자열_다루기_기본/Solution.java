package lv1.문자열_다루기_기본;

public class Solution {
	public static boolean solution(String s) {
		boolean answer = true;
		if (s.length() != 4 && s.length() != 6) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (a < '0' || a > '9') {
				return false;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String s1 = "a234";
		String s2 = "1234";
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}

}