package inflearn.section09.ex07_원더랜드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int v1;
    int v2;
    int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    static int[] UNF;

    private static int find(int v) {
        if (v == UNF[v]) {
            return v;
        } else {
            return UNF[v] = find(UNF[v]);
        }
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            UNF[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        UNF = new int[n + 1];
        List<Edge> arr = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            UNF[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            arr.add(new Edge(v1, v2, weight));
        }

        int answer = 0;
        Collections.sort(arr);

        for (Edge edge : arr) {
            int fv1 = find(edge.v1);
            int fv2 = find(edge.v2);
            // 서로소일 때만 선택
            if (fv1 != fv2) {
                answer += edge.cost;
                union(edge.v1, edge.v2);
            }
        }
        System.out.println(answer);
    }
}
