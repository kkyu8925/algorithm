package inflearn.section04.ex01_학급_회장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private char solution(int n, String str) {
        char answer = ' ';
        Map<Character, Integer> rMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            rMap.put(c, rMap.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for (Character ch : rMap.keySet()) {
            if (rMap.get(ch) > max) {
                max = rMap.get(ch);
                answer = ch;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
