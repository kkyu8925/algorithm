package inflearn.section01.ex05_특정_문자_뒤집기;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])) {
                rt--;
            } else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

