package programmers.탐욕법_greedy.lv3_섬_연결하기;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


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

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;

        List<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] check = new int[n];
        for (int[] cost : costs) {
            int v1 = cost[0];
            int v2 = cost[1];
            int weight = cost[2];
            graph.get(v1).add(new Edge(v2, weight));
            graph.get(v2).add(new Edge(v1, weight));
        }

        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(0, 0));
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

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 4;
        int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
        T.solution(n, costs);
    }
}
