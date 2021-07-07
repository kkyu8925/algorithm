package inflearn.section07.ex13_그래프_최단거리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, dis;

    public void BFS(int v) {
        Queue<Integer> que = new LinkedList<>();
        check[v] = 1;
        dis[v] = 0;
        que.offer(v);
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
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        check = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
