package inflearn.section09.ex08_원더랜드;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int vex;
    int cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        int[] check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(v1).add(new Edge(v2, weight));
            graph.get(v2).add(new Edge(v1, weight));
        }

        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()) {
            Edge now = pQ.poll();
            int endVex = now.vex;

            // 방문한 노드인지 확인
            if (check[endVex] == 0) {
                check[endVex] = 1;
                answer += now.cost;
                for (Edge next : graph.get(endVex)) {
                    if (check[next.vex] == 0) {
                        pQ.offer(new Edge(next.vex, next.cost));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
