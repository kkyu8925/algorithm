package inflearn.section04.ex04_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private int solution(String a, String anagram) {
        int answer = 0;

        // 아나그램 map 생성
        Map<Character, Integer> anagramMap = new HashMap<>();
        for (char ch : anagram.toCharArray()) {
            anagramMap.put(ch, anagramMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> rMap = new HashMap<>();
        for (int i = 0; i < anagram.length() - 1; i++) {
            char key = a.charAt(i);
            rMap.put(key, rMap.getOrDefault(key, 0) + 1);
        }

        int lt = 0;
        for (int rt = anagram.length() - 1; rt < a.length(); rt++) {
            char key = a.charAt(rt);
            rMap.put(key, rMap.getOrDefault(key, 0) + 1);

            if (anagramMap.equals(rMap)) {
                answer++;
            }

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
