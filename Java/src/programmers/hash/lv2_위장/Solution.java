package programmers.hash.lv2_위장;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] one : clothes) {
            String sort = one[1];
            map.merge(sort, 1, (existValue, initValue) -> existValue + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }

        return --answer;
    }

//    public int solution(String[][] clothes) {
//        int answer = 1;
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < clothes.length; i++) {
//            if (map.get(clothes[i][1]) == null) {
//                map.put(clothes[i][1], 1);
//            } else {
//                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
//            }
//        }
//
//        for (String key : map.keySet()) {
//            answer *= map.get(key) + 1;
//        }
//
//        return --answer;
//    }
}