package woo.ex3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] ings, String[] menus, String[] sells) {
        int answer = 0;
        Map<Character, Integer> ingsMap = new HashMap<>();
        for (String ing : ings) {
            String[] split = ing.split(" ");
            Character name = split[0].charAt(0);
            int price = Integer.parseInt(split[1]);
            ingsMap.put(name, price);
        }

        Map<String, Integer> profitMap = new HashMap<>();
        for (String menu : menus) {
            String[] split = menu.split(" ");
            String name = split[0];
            String ingsStr = split[1];
            int price = Integer.parseInt(split[2]);

            int cost = 0;
            for (char c : ingsStr.toCharArray()) {
                cost += ingsMap.get(c);
            }

            profitMap.put(name, price - cost);
        }

        for (String sell : sells) {
            String[] split = sell.split(" ");
            String name = split[0];
            int num = Integer.parseInt(split[1]);

            answer += profitMap.get(name) * num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] ings = {"r 10", "a 23", "t 124", "k 9"};
        String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
        String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};
        System.out.println(T.solution(ings, menu, sell));
    }
}
