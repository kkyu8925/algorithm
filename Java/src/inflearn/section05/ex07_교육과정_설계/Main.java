package inflearn.section05.ex07_교육과정_설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> que = new LinkedList<>();
        for (char ch : need.toCharArray()) {
            que.offer(ch);
        }

        for (char ch : plan.toCharArray()) {
            if (que.contains(ch)) {
                if (ch != que.poll()) {
                    return "NO";
                }
            }
        }

        if (!que.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}
