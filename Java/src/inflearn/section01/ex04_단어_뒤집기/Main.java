package inflearn.section01.ex04_단어_뒤집기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for (String str : strArr) {
            String res = new StringBuilder(str).reverse().toString();
            answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            strArr[i] = sc.next();
        }

        for (String ans : T.solution(strArr)) {
            System.out.println(ans);
        }
    }
}

