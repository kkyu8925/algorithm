package woo.ex7;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] grid, boolean clockwise) {
        String[] answer = {};
        System.out.println("grid = " + Arrays.toString(grid));

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] grid = {"1", "234", "56789"};
        boolean clockwise = false;
        System.out.println(Arrays.toString(T.solution(grid, clockwise)));
    }
}
