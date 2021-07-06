package inflearn.section07.ex03_팩토리얼;

public class Main {
    private int DFS(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * DFS(i - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.DFS(5));
    }
}
