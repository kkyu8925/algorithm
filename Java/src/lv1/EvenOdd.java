package lv1;

public class EvenOdd {

	public static String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(solution(a));
		System.out.println(solution(b));
	}

}
