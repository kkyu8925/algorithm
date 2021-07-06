package inflearn.section06.ex10_마구간정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int dist = (lt + rt) / 2;
            if (count(arr, dist) >= c) {
                answer = dist;
                lt = dist + 1;
            } else {
                rt = dist - 1;
            }
        }
        return answer;
    }

    private int count(int[] arr, int dist) {
        int answer = 1;
        int endPoint = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - endPoint >= dist) {
                answer++;
                endPoint = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, c, arr));
    }
}
