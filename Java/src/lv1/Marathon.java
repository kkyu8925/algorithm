package lv1;

import java.util.Arrays;

class Marathon {
	public static String solution(String[] part, String[] com) {
		Arrays.sort(part);
		Arrays.sort(com);

		int i = 0;
		for (i = 0; i < com.length; i++) {
			if (!part[i].equals(com[i])) {
				return part[i];
			}
		}
		return part[i];
	}

	public static void main(String[] args) {
		String[] part = { "kiki", "eden", "leo" };
		String[] com = { "kiki", "leo" };
		System.out.println(solution(part, com));

	}
}
