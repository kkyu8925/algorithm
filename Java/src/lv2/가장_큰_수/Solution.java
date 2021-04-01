package lv2.가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strArr = new String[numbers.length];
        int i = 0;
        for (int num : numbers) {
            strArr[i++] = String.valueOf(num);
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if (strArr[0].equals("0")) {
            return "0";
        }


        return String.join("", strArr);
    }
}
