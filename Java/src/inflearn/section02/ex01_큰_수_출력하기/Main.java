package inflearn.section02.ex01_큰_수_출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
