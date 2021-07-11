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
                dfs(i, check, wires);
            }
        }

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
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        T.solution(n, wires);
    }
}
