package grab.ex3;

public class Solution {
    static int[] check;

    public int solution(String word, String[] cards) {
        int answer = -1;
        check = new int[cards.length];

        dfs(0, cards);

        return answer;
    }

    private void dfs(int level, String[] cards) {
        if(level==cards.length) {

        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String word = "APPLE";
        String[] cards = {"LLZKE", "LCXEA", "CVPPS", "EAVSR", "FXPFP"};
        T.solution(word, cards);
    }
}
