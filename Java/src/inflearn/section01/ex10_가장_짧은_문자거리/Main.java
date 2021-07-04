package inflearn.section01.ex10_가장_짧은_문자거리;

import java.util.Scanner;

public class Main {

    public int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        int distance = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }

        distance = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                distance = 0;
            } else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
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
