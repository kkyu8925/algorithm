package programmers.lv1.시저_암호;

public class Solution {
	public static String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				ch = ' ';
			} else if (ch >= 'a' && ch <= 'z') {
				if (ch + n > 'z') {
					ch = (char) (ch + n - 26);
				} else {
					ch = (char) (ch + n);
				}
			} else if (ch >= 'A' && ch <= 'Z') {
				if (ch + n > 'Z') {
					ch = (char) (ch + n - 26);
				} else {
					ch = (char) (ch + n);
				}
			}
			answer += ch;
		}
		return answer;
	}

	public static void main(String[] args) {
		String s1 = "AB";
		String s2 = "z";
		String s3 = "a B z";
		int n1 = 1;
		int n2 = 1;
		int n3 = 4;
		System.out.println(solution(s1, n1));
		System.out.println(solution(s2, n2));
		System.out.println(solution(s3, n3));
	}

}
