package inflearn.section05.ex04_후위식_연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private int solution(String str) {
        int answer;
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch-48);
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(ch=='+') stack.push(num1 + num2);
                else if (ch == '-') stack.push(num1 - num2);
                else if (ch == '*') stack.push(num1 * num2);
                else if (ch == '/') stack.push(num1 / num2);
            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
