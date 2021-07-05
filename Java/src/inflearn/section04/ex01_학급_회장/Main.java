package inflearn.section04.ex01_학급_회장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private char solution(int n, String str) {
        char answer = ' ';
        Map<Character, Integer> rMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            rMap.put(ch, rMap.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        for (char key : rMap.keySet()) {
            if (rMap.get(key) > max) {
                max = rMap.get(key);
                answer = key;
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
