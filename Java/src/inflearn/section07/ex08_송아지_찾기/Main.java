package inflearn.section07.ex08_송아지_찾기;

import java.util.*;

/**
 * BFS = 최단거리
 */
public class Main {
    int[] disArr = {1, -1, 5};
    Set<Integer> check = new HashSet<>(); // 중복 체크
    Queue<Integer> que = new LinkedList<>();

    private int BFS(int start, int arrival) {
        check.add(start);
        que.offer(start);
        int L = 0;
        while (!que.isEmpty()) {
            int len = que.size();
            for (int i = 0; i < len; i++) {
                int current = que.poll();

//                if (current == arrival) {
//                    return L;
//                }

                for (int dis : disArr) {
                    int next = current + dis;

                    // 조금 더 나은 방법
                    if (next == arrival) {
                        return L + 1;
                    }

                    if (!check.contains(next) && next > 0) {
                        check.add(next);
                        que.offer(next);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int arrival = sc.nextInt();
        System.out.println(T.BFS(start, arrival));
    }
}