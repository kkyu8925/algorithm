package inflearn.section01.ex11_문자열_압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        str = str + " "; // 마지막 글자도 확인을 위해 공백 추가
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer.append(str.charAt(i));

                if (cnt > 1) {
                    // 덧셈 연사자를 진행할때 연산자중 한 쪽이 String 형이면 나머지 쪽을 String 형태로 변환
                    answer.append(cnt);
                }

                cnt = 1;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
