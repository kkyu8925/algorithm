package lv1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static String solution(String s) {
		String[] arr = s.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		String a = String.join("", arr);
		return a;
	}

	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

}
