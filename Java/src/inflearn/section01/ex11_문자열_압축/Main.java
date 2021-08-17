package inflearn.section01.ex11_문자열_압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        str = str + " "; // 마지막 글자도 확인을 위해 공백 추가
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);

                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }

                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
