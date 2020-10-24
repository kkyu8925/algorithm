package lv1;

public class PhoneNum {
	public static String solution(String pn) {
		String[] a = pn.split("");
		String[] ar = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 4) {
				ar[i] = "*";
			} else {
				ar[i] = a[i];
			}
		}
		return String.join("", ar);
	}

	public static void main(String[] args) {
		String st1 = "01033334444";
		String st2 = "027778888";
		System.out.println(solution(st1));
		System.out.println(solution(st2));
	}
}
