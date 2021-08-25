package inflearn.section07.ex11_경로탐색;

import java.util.Scanner;

public class Main {
    // N-Node 개수, E-Edge 개수
    static int N, E, answer = 0;
    static int[][] graph;
    static int[] check;

    public void DFS(int node) {
        if (node == N) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[node][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();
        graph = new int[N + 1][E + 1];
        check = new int[N + 1];
        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 단반향 그래프
            graph[a][b] = 1;

            // 양반향 그래프
//            graph[a][b] = 1;
//            graph[b][a] = 1;
        }
        check[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
