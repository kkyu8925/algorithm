package programmers.hash.lv1_완주하지_못한_선수;

import java.util.Arrays;

class Solution {
    public static String solution(String[] part, String[] com) {
        Arrays.sort(part);
        Arrays.sort(com);

        int i;
        for (i = 0; i < com.length; i++) {
            if (!part[i].equals(com[i])) {
                return part[i];
            }
        }
        return part[i];
    }

    public static void main(String[] args) {
        String[] part = {"kiki", "eden", "leo"};
        String[] com = {"kiki", "leo"};
        System.out.println(solution(part, com));
    }
}
