package lv2.이진_변환_반복하기;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int cnt = 0;
        int remove = 0;

        while (!s.equals("1")) {
            int before = s.length();
            s = s.replaceAll("0", "");
            int after = s.length();
            s = Integer.toBinaryString(after);

            cnt++;
            remove += before - after;
        }

        answer[0] = cnt;
        answer[1] = remove;

        return answer;
    }
}
