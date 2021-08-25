package inflearn.section07.ex12_경로탐색_인접리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // N-Node 개수, E-Edge 개수
    static int N, E, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int node) {
        if (node == N) {
            answer++;
        } else {
            for (int next : graph.get(node)) {
                if (ch[next] == 0) {
                    ch[next] = 1;
                    DFS(next);
                    ch[next] = 0;
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

        ch = new int[N + 1];

        // dfs start
        ch[1] = 1;
        T.DFS(1);

        System.out.println(answer);
    }
}
