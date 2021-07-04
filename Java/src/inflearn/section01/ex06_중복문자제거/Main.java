package inflearn.section01.ex06_중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == i) {
                answer += ch;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}