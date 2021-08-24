package inflearn.section07.ex04_피보나치_재귀;

public class Main {
    static int[] fi;

    private int memoization(int n) {
        if (fi[n] > 0) {
            return fi[n];
        }

        if (n < 2) {
            return fi[n] = n;
        } else {
            return fi[n] = memoization(n - 1) + memoization(n - 2);
        }
    }

    private int DFS(int n) {
        if (n < 2) {
            return n;
        } else {
            return DFS(n - 1) + DFS(n - 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 10;

        // recursive
        for (int i = 1; i <= n; i++) {
            System.out.println(T.DFS(i));
        }

        System.out.println("-----------");

        // memoization
        fi = new int[n + 1];
        T.memoization(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(fi[i]);
        }
    }
}
