package inflearn.section01.ex10_가장_짧은_문자거리;

import java.util.Scanner;

public class Main {

    public int[] solution(String str, char ch) {
        int length = str.length();
        int[] answer = new int[length];
        int distance = length; // 최대 길이

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }

        distance = length;

        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = Math.min(distance, answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        for (int num : T.solution(str, ch)) {
            System.out.print(num + " ");
        }
    }
}
