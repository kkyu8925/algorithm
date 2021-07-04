package inflearn.section01.ex01_문자찾기;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char ch : str.toCharArray()) {
            if (ch == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
