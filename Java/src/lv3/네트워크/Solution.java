package lv3.네트워크;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        answer = dfs(n, 0, 0, computers);
        return answer;
    }

    int dfs(int n, int node, int sum, int[][] computers) {
        return dfs(n, node + 1, sum, computers) + dfs(n, node - 1, sum, computers);
    }
}
