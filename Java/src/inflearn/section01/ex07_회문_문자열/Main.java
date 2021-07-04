package section01.ex07_회문_문자열;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        int len = str.length();
        str = str.toUpperCase();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return "NO";
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
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
