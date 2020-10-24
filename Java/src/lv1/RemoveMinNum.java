package lv1;

import java.util.*;

public class RemoveMinNum {
	public static int[] solution(int[] arr) {
		List<Integer> al = new ArrayList<>();

		if (arr.length <= 1) {
			return new int[] { -1 };
		}

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (min != arr[i]) {
				al.add(arr[i]);
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
		int arr[] = { 4, 3, 2, 1 };
		int arr2[] = { 10 };
		System.out.println(Arrays.toString(solution(arr)));
		System.out.println(Arrays.toString(solution(arr2)));
	}

}
