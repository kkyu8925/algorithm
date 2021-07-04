package inflearn.section01.ex09_숫자만_추출;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
