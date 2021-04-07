package lv2.예상_대진표;

public class Solution2 {
    public int solution(int n, int a, int b) {
        return Integer.toBinaryString((a - 1) ^ (b - 1)).length();
    }
}