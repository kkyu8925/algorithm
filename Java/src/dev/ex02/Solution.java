package dev.ex02;

import java.util.Stack;

class Solution {
    public int[] solution(int[] deposit) {
        Stack<Integer> stack = new Stack<>();
        for (int money : deposit) {
            if (money > 0) {
                stack.push(money);
            } else if (money < 0) {
                while (money < 0) {
                    int res = stack.pop();
                    money = money + res;
                    if (money > 0) {
                        stack.push(money);
                    }
                }
            }
        }
        int[] arr = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            arr[i] = stack.pop();
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] deposit = {500, 1000, -300, 200, -400, 100, -100};
        T.solution(deposit);
    }
}
