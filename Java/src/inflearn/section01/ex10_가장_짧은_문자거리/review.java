package inflearn.section01.ex10_가장_짧은_문자거리;

import java.util.Scanner;

public class review {

    public int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        int strLen = str.length();

        int distance = strLen;

        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) == ch) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }

        distance = strLen;

        for (int i = strLen - 1; i >= 0; i--) {
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
        review T = new review();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        for (int num : T.solution(str, ch)) {
            System.out.print(num + " ");
        }
    }
}
