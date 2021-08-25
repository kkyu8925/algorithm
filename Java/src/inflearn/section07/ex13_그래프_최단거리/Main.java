package inflearn.section07.ex13_그래프_최단거리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, E;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, dis;

    public void BFS(int node) {
        Queue<Integer> que = new LinkedList<>();
        check[node] = 1;
        dis[node] = 0;
        que.offer(node);

        while (!que.isEmpty()) {
            int current = que.poll();
            for (int next : graph.get(current)) {
                if (check[next] == 0) {
                    check[next] = 1;
                    que.offer(next);
                    dis[next] = dis[current] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();

        // graph 초기화
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        check = new int[N + 1];
        dis = new int[N + 1];

        T.BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
