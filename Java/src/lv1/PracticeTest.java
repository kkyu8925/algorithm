package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PracticeTest {
	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] arr3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] cnt = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == arr1[i % 5]) {
				cnt[0]++;
			}
			if (answers[i] == arr2[i % 8]) {
				cnt[1]++;
			}
			if (answers[i] == arr3[i % 10]) {
				cnt[2]++;
			}
		}

		int max = cnt[0];
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
			}
		}

		List<Integer> rList = new ArrayList<>();
		if (max == cnt[0]) {
			rList.add(1);
		}
		if (max == cnt[1]) {
			rList.add(2);
		}
		if (max == cnt[2]) {
			rList.add(3);
		}

		answer = new int[rList.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = rList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] answers1 = { 1, 2, 3, 4, 5 };
		int[] answers2 = { 1, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(solution(answers1)));
		System.out.println(Arrays.toString(solution(answers2)));
	}
}