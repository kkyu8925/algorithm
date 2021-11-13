package inflearn.section05.ex02_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while (true) {
                    Character pop = stack.pop();
                    if (pop == '(') {
                        break;
                    }
                }
            } else {
                stack.push(ch);
            }
        }
        for (Character ch : stack) {
            answer.append(ch);
        }
        return answer.toString();
    }

    private String solution2(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    answer.append(ch);
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
