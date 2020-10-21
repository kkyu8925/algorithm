package lv1;

import java.util.*;

public class Dislike2 {
	public static int[] solution(int[] arr) {
		List<Integer> al = new ArrayList<>();
		int a = 10;
		for (int i : arr) {
			if (a != i) {
				al.add(i);
				a = i;
			}
		}
		int[] answer = new int[al.size()];
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
