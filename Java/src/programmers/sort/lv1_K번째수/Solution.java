package programmers.sort.lv1_K번째수;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int b = 0;
		for (int[] command : commands) {
			int start = command[0];
			int end = command[1];
			int num = command[2];
			int a = 0;
			int[] arr = new int[end - start + 1];
			for (int j = start - 1; j < end; j++) {
				arr[a++] = array[j];
			}
			Arrays.sort(arr);
			answer[b++] = arr[num - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(Arrays.toString(solution(array, commands)));
	}

}
