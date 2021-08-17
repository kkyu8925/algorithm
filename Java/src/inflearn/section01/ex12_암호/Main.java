package inflearn.section01.ex12_암호;

import java.util.Scanner;

public class Main {
    public String solution(int n, String str) {
        String answer = "";
        str = str.replace("#", "1").replace("*", "0");

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7);
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.print(T.solution(num, str));
    }
}
