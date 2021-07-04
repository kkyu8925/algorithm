package programmers.lv2.위장;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (hm.get(clothes[i][1]) == null) {
                hm.put(clothes[i][1], 1);
            } else {
                hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
            }
        }

        for (String key : hm.keySet()) {
            answer *= hm.get(key) + 1;
        }
        answer -= 1;

        return answer;
    }
}