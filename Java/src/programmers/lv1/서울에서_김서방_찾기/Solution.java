package programmers.lv1.서울에서_김서방_찾기;

public class Solution {
	public static String solution(String[] s) {
		String answer = "";
		String k = "Kim";
		int i = 0;
		for (i = 0; i < s.length; i++) {
			if (s[i].equals(k)) {
				break;
			}
		}
		answer = "김서방은 " + i + "에 있다";
		return answer;
	}

	public static void main(String[] args) {
		String[] s = { "jane", "Kim" };
		System.out.println(solution(s));
	}

}
