package dev.ex03;


class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 0;
        boolean[] check = new boolean[n + 1];

        // init
        for (int i = 0; i < n + 1; i++) {
            check[i] = false;
        }

        for (int i = 1; i <= n; i++) {
            if (check[i] == false) {
                answer++;
                dfs(i, check, wires);
            }
        }
        System.out.println(answer);
        return answer;
    }

    private void dfs(int node, boolean[] check, int[][] wires) {
        check[node] = true;

        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            if (check[b] == false) {
                dfs(b, check, wires);
            }
            if (check[a] == false) {
                dfs(a, check, wires);
            }
        }
    }


    public static void main(String[] args) {
        Solution T = new Solution();
        int n1 = 9;
        int[][] wires1 = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        T.solution(n1, wires1); // 3
        int n2 = 4;
        int[][] wires2 = {{1, 2}, {2, 3}, {3, 4}};
        T.solution(n2, wires2); // 0
        int n3 = 7;
        int[][] wires3 = {{1, 2}, {2, 7}, {7, 3}, {3, 4}, {4, 5}, {7, 6}};
        T.solution(n3, wires3); // 1
    }
}
