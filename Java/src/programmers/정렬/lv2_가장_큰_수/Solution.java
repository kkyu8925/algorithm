package programmers.정렬.lv2_가장_큰_수;

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        String[] strArr = new String[numbers.length];
        int i = 0;
        for (int num : numbers) {
            strArr[i++] = String.valueOf(num);
        }

        Arrays.sort(strArr, (o1, o2) -> ((o2 + o1).compareTo(o1 + o2)));

        if (strArr[0].equals("0")) {
            return "0";
        }

        return String.join("", strArr);
    }
}
