package inflearn.section04.ex04_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private int solution(String a, String b) {
        int answer = 0;
        Map<Character, Integer> compareMap = new HashMap<>();
        for (char ch : b.toCharArray()) {
            compareMap.put(ch, compareMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> rMap = new HashMap<>();
        for (int i = 0; i < b.length() - 1; i++) {
            char key = a.charAt(i);
            rMap.put(key, rMap.getOrDefault(key, 0) + 1);
        }

        int lt = 0;
        for (int rt = b.length() - 1; rt < a.length(); rt++) {
            char key = a.charAt(rt);
            rMap.put(key, rMap.getOrDefault(key, 0) + 1);
            if (compareMap.equals(rMap)) answer++;

            key = a.charAt(lt);
            rMap.put(key, rMap.get(key) - 1);
            if (rMap.get(key) == 0) {
                rMap.remove(key);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(T.solution(a, b));
    }
}
