package inflearn.section01.ex08_유효한_팰린드롬;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (!str.equals(tmp)) {
            return "NO";
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
