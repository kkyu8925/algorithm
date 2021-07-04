package programmers.lv2.괄호_회전하기;

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                String tmp = Character.toString(s.charAt(0));
                s = s.substring(1) + tmp;
            }

            for (char ch : s.toCharArray()) {
                if (ch == '{' || ch == '[' || ch == '(') {
                    stack.push(ch);
                } else if (!stack.isEmpty()) {
                    if (ch == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (ch == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (ch == ')' && stack.peek() == '(') {
                        stack.pop();
                    }
                } else {
                    answer--;
                    break;
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }

        }
        return answer;
    }
}
