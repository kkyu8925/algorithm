package inflearn.section05.ex02_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(ch);
            }
        }
        for (Character ch : stack) {
            answer += ch;
        }
        return answer;
    }

    private String solution2(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    answer += ch;
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
