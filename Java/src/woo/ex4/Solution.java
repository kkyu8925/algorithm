package woo.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(String s) {
        int[] answer;
        s = s + " ";
        StringBuilder res = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                res.append(s.charAt(i)).append(cnt).append(" ");
                cnt = 1;
            }
        }

        List<Integer> rList = new ArrayList<>();
        String[] split = res.toString().split(" ");

        if (split[0].charAt(0) == split[split.length - 1].charAt(0)) {
            int first = Integer.parseInt(split[0].substring(1));
            int last = Integer.parseInt(split[split.length - 1].substring(1));
            rList.add(first + last);

            for (int i = 1; i < split.length - 1; i++) {
                rList.add(Integer.parseInt(split[i].substring(1)));
            }
        } else {
            for (String str : split) {
                rList.add(Integer.parseInt(str.substring(1)));
            }
        }

        Collections.sort(rList);

        answer = new int[rList.size()];
        for (int i = 0; i < rList.size(); i++) {
            answer[i] = rList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "aaabbaaa";
        System.out.println(Arrays.toString(T.solution(s)));
    }
}
