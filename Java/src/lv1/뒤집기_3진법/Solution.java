package lv1.뒤집기_3진법;

class Solution {
    public int solution(int n) {
        int answer = 0;

        String res = "";

        while (n / 3 != 0) {
            res += n % 3;
            n /= 3;
        }
        res += String.valueOf(n);

        answer = Integer.parseInt(res, 3);

        return answer;
    }
}
