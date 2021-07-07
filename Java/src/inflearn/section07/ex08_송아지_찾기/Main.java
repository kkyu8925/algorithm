package inflearn.section07.ex08_송아지_찾기;

import java.util.*;

public class Main {
    int[] dis = {1, -1, 5};
    Set<Integer> set = new HashSet<>(); // 중복 체크
    Queue<Integer> que = new LinkedList<>();

    private int BFS(int s, int e) {
        set.add(s);
        que.offer(s);
        int L = 0;
        while (!que.isEmpty()) {
            int len = que.size();
            for (int i = 0; i < len; i++) {
                int current = que.poll();
                for (int x : dis) {
                    int next = current + x;

                    if (next == e) {
                        return L + 1;
                    }

                    if (!set.contains(next)) {
                        set.add(next);
                        que.offer(next);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
