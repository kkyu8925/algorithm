package programmers.lv1.가운데_글자_가져오기;

class Solution {
	public String solution(String a) {
		if (a.length() % 2 == 0) {
			return a.substring(a.length() / 2 - 1, a.length() / 2 + 1);
		} else {
			return String.valueOf(a.charAt(a.length() / 2));
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("abcde"));
		System.out.println(s.solution("qwer"));
	}
}
