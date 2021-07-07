package inflearn.section07.ex06_부분집합_구하기;

public class Main {
    static int n;
    static int[] check;

    public void DFS(int L) {
        if (L == n + 1) {
            String answer = "";
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    answer += i + " ";
                }
            }

            if (answer.length() > 0) {
                System.out.println(answer);
            }
        } else {
            check[L] = 1;
            DFS(L + 1);
            check[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        check = new int[n + 1];
        T.DFS(1);
    }
}
