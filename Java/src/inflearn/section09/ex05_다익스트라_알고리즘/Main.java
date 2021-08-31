package inflearn.section09.ex05_다익스트라_알고리즘;

import java.util.*;

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
    static int N, M; // N-정점의 개수, M-간선의 개수
    static List<ArrayList<Edge>> GRAPH;
    static int[] DIS;

    private void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        DIS[v] = 0;
        while (!pQ.isEmpty()) {
            Edge now = pQ.poll();
            int nowVex = now.vex;
            int nowCost = now.cost;

            // 시간복잡도 해결
            if (nowCost > DIS[nowVex]) {
                continue;
            }

            for (Edge edge : GRAPH.get(nowVex)) {
                if (DIS[edge.vex] > nowCost + edge.cost) {
                    DIS[edge.vex] = nowCost + edge.cost;
                    pQ.offer(new Edge(edge.vex, nowCost + edge.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        // 가중치 그래프 생성
        GRAPH = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            GRAPH.add(new ArrayList<>());
        }

        DIS = new int[N + 1];
        Arrays.fill(DIS, Integer.MAX_VALUE);

        // 가중치 그래프 입력
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int weight = sc.nextInt();
            GRAPH.get(start).add(new Edge(end, weight));
        }

        T.solution(1);

        for (int i = 2; i < N + 1; i++) {
            if (DIS[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + DIS[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }
    }
}
