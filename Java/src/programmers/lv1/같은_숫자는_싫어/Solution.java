package programmers.lv1.같은_숫자는_싫어;

import java.util.*;

public class Solution {
	public static int[] solution(int[] arr) {
		int[] answer = {};
		List<Integer> al = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				al.add(arr[i]);
			}
		}

		al.add(arr[arr.length - 1]);

		answer = new int[al.size()];
		int i = 0;
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			answer[i] = it.next();
			i++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = { 4, 4, 4, 3, 3 };
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
	}
}
