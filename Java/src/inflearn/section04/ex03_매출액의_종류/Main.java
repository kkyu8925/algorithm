package inflearn.section04.ex03_매출액의_종류;

import java.util.*;

public class Main {
    private List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> rMap = new HashMap<>();
        int lt = 0;
        for (int i = 0; i < k - 1; i++) {
            rMap.put(arr[i], rMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int rt = k - 1; rt < n; rt++) {
            rMap.put(arr[rt], rMap.getOrDefault(arr[rt], 0) + 1);
            answer.add(rMap.size());

            rMap.put(arr[lt], rMap.get(arr[lt]) - 1);
            if (rMap.get(arr[lt]) == 0) {
                rMap.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
