package programmers.lv1.나누어_떨어지는_숫자_배열;

import java.util.*;

public class Solution {
	public static int[] solution(int[] arr, int div) {
		int[] answer = {};
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % div == 0) {
				al.add(arr[i]);
			}
		}

		if (al.size() == 0) {
			al.add(-1);
		}

		answer = new int[al.size()];
		int i = 0;
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			answer[i] = it.next();
			i++;
		}

		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 9, 7, 10 };
		int[] arr2 = { 2, 36, 1, 3 };
		int[] arr3 = { 3, 2, 6 };
		int div1 = 5;
		int div2 = 1;
		int div3 = 10;
		System.out.println(Arrays.toString(solution(arr1, div1)));
		System.out.println(Arrays.toString(solution(arr2, div2)));
		System.out.println(Arrays.toString(solution(arr3, div3)));
	}

}
