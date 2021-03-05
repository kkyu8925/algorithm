package lv1.문자열_내_마음대로_정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static String[] solution(String[] str, int n) {
		String[] answer = {};
		List<String> al = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			al.add(str[i].charAt(n) + str[i]);
		}
		Collections.sort(al);
		answer = new String[al.size()];

		// iterator 바꿔보기
		// for (int i = 0; i < al.size(); i++) {
		// answer[i] = al.get(i).substring(1, al.get(i).length());
		// }

		int i = 0;
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			answer[i] = it.next().substring(1, al.get(i).length());
			i++;
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] s1 = { "sun", "bed", "car" };
		int n1 = 1;
		System.out.println(Arrays.toString(solution(s1, n1)));

		String[] s2 = { "abce", "abcd", "cdx" };
		int n2 = 2;
		System.out.println(Arrays.toString(solution(s2, n2)));
	}

}
