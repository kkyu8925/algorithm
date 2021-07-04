package inflearn.section01.ex02_대소문자_변환;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                answer += Character.toUpperCase(ch);
            } else {
                answer += Character.toLowerCase(ch);
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