package lv1;

public class Strchangeint {
	public static int solution(String s) {
		int answer = Integer.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "-1234";
		System.out.println(solution(str1));
		System.out.println(solution(str2));
	}

}
