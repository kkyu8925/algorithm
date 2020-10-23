package lv1;

import java.util.Arrays;

public class KNum {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int b = 0;
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int num = commands[i][2];
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
