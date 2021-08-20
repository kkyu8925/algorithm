package inflearn.section04.ex02_아나그램;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private String solution(String a, String b) {
        String answer = "YES";
        Map<Character, Integer> rMap = new HashMap<>();

        for (char ch : a.toCharArray()) {
            rMap.put(ch, rMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : b.toCharArray()) {
            if (!rMap.containsKey(ch) || rMap.get(ch) == 0) {
                return "NO";
            } else {
                rMap.put(ch, rMap.get(ch) - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}
