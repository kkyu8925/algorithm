package lv1;

public class StrageStr {
	public static String solution(String s) {
		String answer = "";
		String[] st = s.split("");
		int cnt = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals(" ")) {
				cnt = 0;
			} else if (cnt % 2 == 0) {
				st[i] = st[i].toUpperCase();
				cnt++;
			} else {
				st[i] = st[i].toLowerCase();
				cnt++;
			}
			answer += st[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}

}
