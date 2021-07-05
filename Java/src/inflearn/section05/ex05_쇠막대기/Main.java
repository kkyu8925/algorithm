package inflearn.section05.ex05_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();
                if (str.charAt(i - 1) == ')') {
                    answer++;
                } else {
                    answer += stack.size();
                }
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
