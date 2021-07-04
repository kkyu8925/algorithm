package inflearn.section01.ex03_문장_속_단어;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;

        String[] words = str.split(" ");

        for (String word : words) {
            int len = word.length();
            if (len > max) {
                max = len;
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
