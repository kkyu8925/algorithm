package programmers.lv1.평균_구하기;

public class Solution {
	public static double solution(int[] arr) {
		double answer = 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		answer = sum / arr.length;
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] ar = { 5, 5 };
		System.out.println(solution(arr));
		System.out.println(solution(ar));

	}

}
